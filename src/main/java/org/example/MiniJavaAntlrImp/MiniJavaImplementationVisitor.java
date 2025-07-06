package org.example.MiniJavaAntlrImp;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import java.util.*;

public class MiniJavaImplementationVisitor extends MiniJavaBaseVisitor<AttributeContainer> {
    private Map<String, Environment> classEnvironments;
    private ErrorHandler errorHandler;
    private String currentClass;
    private Environment currentEnvironment;
    private IntGenerator ifIntGenerator;
    private IntGenerator whileIntGenerator;
    private IntGenerator doWhileIntGenerator;
    private IntGenerator forIntGenerator;
    private IntGenerator tempIntGenerator;
    private Stack<LoopLabelTuple> loopLabels;
    private MethodSymbol currentMethod;
    private static final String superDot = "super.";
    private static final String tempVariablePrefix = "temp_var_";

    public MiniJavaImplementationVisitor(Map<String, Environment> classEnvironments,
                                         ErrorHandler errorHandler) {
        this.classEnvironments = classEnvironments;
        this.errorHandler = errorHandler;
        this.ifIntGenerator = new IntGenerator();
        this.whileIntGenerator = new IntGenerator();
        this.doWhileIntGenerator = new IntGenerator();
        this.forIntGenerator = new IntGenerator();
        this.tempIntGenerator = new IntGenerator();
        this.loopLabels = new Stack<>();

    }

    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public Map<String, Environment> getClassEnvironments() {
        return classEnvironments;
    }

    public void setClassEnvironments(Map<String, Environment> classEnvironments) {
        this.classEnvironments = classEnvironments;
    }

    public String thisReference(){
        return "caller_" + currentClass;
    }

    private Resolvation<Symbol> resolveVariable(String variableName){
        Resolvation<Symbol> resolvation = null;
        boolean alreadyHitCurrentClass = false;
        StringBuilder prefix = new StringBuilder();
        Environment environment = null;
        for(environment = currentEnvironment; environment != null; environment = environment.getParent()){
            if(environment.isClassEnvironment()){
                if(alreadyHitCurrentClass){ // searching in super classes
                    prefix.append(superDot);
                }
                else{ // still in current class
                    if(environment.isClassEnvironment()){ // searching in current class fields
                        alreadyHitCurrentClass = true;
                        prefix.append("caller_").append(currentClass).append("->");
                    }
                }
            }
            if(environment.containsSymbolName(variableName)){
                resolvation = new Resolvation<>(
                        prefix + "->" + variableName,
                        environment.getSymbol(variableName)
                );
                break;
            }
        }
        return resolvation;
    }

    private Resolvation<Symbol> resolveField(String fieldName, String javaClass){
        Resolvation<Symbol> resolvation = null;
        if(!classEnvironments.containsKey(javaClass)){
            errorHandler.error("no class with name: " + javaClass);
            return resolvation;
        }
        Environment javaClassEnvironment = classEnvironments.get(javaClass);
        StringBuilder postfix = new StringBuilder();
        Environment environment;
        for(environment = javaClassEnvironment; environment != null; environment = environment.getParent()){
            if(environment.containsSymbolName(fieldName)){
                resolvation = new Resolvation<>(
                        postfix + "->" + fieldName,
                        environment.getSymbol(fieldName)
                );
                break;
            }
            postfix.append(superDot);
        }
        return resolvation;
    }

    private Resolvation<MethodSymbol> resolveMethod(String methodName,
                                                    String javaClass,
                                                    List<String> argumentsJavaTypes){
        Resolvation<MethodSymbol> resolvation = null;
        if(!classEnvironments.containsKey(javaClass)){
            errorHandler.error("no class with name: " + javaClass);
            return null;
        }
        StringBuilder postfix = new StringBuilder();
        Environment environment;
        Environment javaClassEnvironment = classEnvironments.get(javaClass);
        String signature = MethodSymbol.getSignatureToResolve(methodName, argumentsJavaTypes);
        for(environment = javaClassEnvironment; environment != null; environment = environment.getParent()){
            if(environment.containsMethodSignature(signature)){
                resolvation = new Resolvation<>(
                        postfix + "->function_" +methodName,
                        (MethodSymbol) environment.getSymbol(signature)
                );
                break;
            }
            postfix.append(superDot);
        }
        return resolvation;
    }

    private boolean doesExtend(String childClassName, String parentClassName){
        boolean extend = false;
        Environment childEnvironment = this.classEnvironments.get(childClassName);
        Environment parentEnvironment = this.classEnvironments.get(parentClassName);
        for(Environment environment = childEnvironment; environment != null; environment = environment.getParent()){
            if(environment == parentEnvironment){
                return true;
            }
        }
        return false;
    }

    @Override
    public AttributeContainer visitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(MiniJavaParser.ClassDeclarationContext classDeclarationContext: ctx.classDeclaration()){
            AttributeContainer classAttributeContainer = visit(classDeclarationContext);
            result.appendToCode(classAttributeContainer.getCode());
        }
        AttributeContainer mainAttributeContainer = visit(ctx.mainClass());
        result.setMainCode(mainAttributeContainer.getMainCode());
        return result;
    }

    @Override
    public AttributeContainer visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx) {
        AttributeContainer classBodyAttributeContainer = visit(ctx.classBody());
        currentClass = ctx.className.getText();
        currentEnvironment = classEnvironments.get(currentClass);
        classBodyAttributeContainer.insertAtFirstOfCode("// class: " + ctx.className.getText() + "\n");
        classBodyAttributeContainer.appendToCode("\n");
        return classBodyAttributeContainer;
    }

    @Override
    public AttributeContainer visitClasssBodyDeclar(MiniJavaParser.ClasssBodyDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.appendToConstructorCodes(
                "struct "
                        + currentClass
                        + "* "
                        + "new_"
                        + currentClass
                        + "(){\n"
        );
        result.appendToConstructorCodes(
                "struct "
                        + currentClass
                        + "* "
                        + "instance_"
                        + currentClass
                        + " = "
                        + "malloc(sizeof(struct "
                        + currentClass
                        + "));\n"


        );
        for(MiniJavaParser.MethodDeclarationContext methodDeclarationContext: ctx.methodDeclaration()){
            AttributeContainer methodAttributeContainer = visit(methodDeclarationContext);
            result.appendToConstructorCodes(methodAttributeContainer.getConstructorsCode());
            result.appendToMethodsCode(methodAttributeContainer.getMethodsCode());
        }
        result.appendToConstructorCodes(
                "return instance_"
                        + currentClass
                        + ";\n"
        );
        result.appendToConstructorCodes("}\n");
        result.setCode(result.getConstructorsCode() + result.getMethodsCode());
        return result;
    }

    @Override
    public AttributeContainer visitMethodDeclar(MiniJavaParser.MethodDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        this.currentEnvironment = new Environment(currentEnvironment);
        String returnCType = "void";
        String returnJavaType = "void";

        if(ctx.type() != null){
            AttributeContainer returnTypeAttributeContainer = visit(ctx.type());
            returnCType = returnTypeAttributeContainer.getcType();
            returnJavaType = returnTypeAttributeContainer.getJavaType();
        }
        AttributeContainer parameterListAttributeContainer = visit(ctx.parameterList());
        StringBuilder methodCode = new StringBuilder(returnCType
                + " "
                + currentClass
                + "_function_"
                + ctx.methodName.getText()
                + "(void* caller");
        MethodSymbol methodSymbol = new MethodSymbol(
                ctx.methodName.getText(),
                "method",
                returnJavaType,
                returnCType,
                parameterListAttributeContainer.getJavaTypeList()
        );
        this.currentMethod = methodSymbol;
        int parameterListSize = parameterListAttributeContainer.getcTypeList().size();
        for(int i = 0; i < parameterListSize; i++){
            String parameterCType = parameterListAttributeContainer.getcTypeList().get(i);
            String parameterJavaType = parameterListAttributeContainer.getJavaTypeList().get(i);
            String parameterAddress = parameterListAttributeContainer.getParameterList().get(i);
            this.currentEnvironment.putSymbol(
                    new Symbol(
                            parameterAddress,
                            "parameter",
                            parameterJavaType,
                            parameterCType
                    )
            );
            methodCode.append(", ")
                    .append(parameterCType)
                    .append(" ")
                    .append(parameterAddress);
        }
        methodCode.append("){\n");
        methodCode.append("struct ")
                .append(currentClass)
                .append("* caller_")
                .append(currentClass)
                .append(" = (struct ")
                .append(currentClass)
                .append("*) caller;");
        for(MiniJavaParser.StatementContext statementContext: ctx.statement()){
            AttributeContainer statementAttributeContainer = visit(statementContext);
            methodCode.append("\n");
            methodCode.append(statementAttributeContainer.getCode());
        }
        methodCode.append("\n}\n");
        currentEnvironment = currentEnvironment.getParent();
        result.setcType(returnCType);
        result.setJavaType(returnJavaType);
        result.setcTypeList(parameterListAttributeContainer.getcTypeList());
        result.setJavaTypeList(parameterListAttributeContainer.getJavaTypeList());
        result.setParameterList(parameterListAttributeContainer.getParameterList());
        result.setMethodsCode(methodCode.toString());
        List<Integer> supersThatMethodOverrides = classEnvironments.get(currentClass)
                .overridingSuperIndices(methodSymbol);
        supersThatMethodOverrides.addFirst(0); // add for current class too
        for(int superIndex: supersThatMethodOverrides){
            result.appendToConstructorCodes(
                    "instance_"
                            + currentClass
                            + "->"
                            + superDot.repeat(Math.max(0, superIndex))
                            +"function_"
                            + ctx.methodName.getText()
                            + " = "
                            + currentClass
                            + "_function_"
                            + ctx.methodName.getText()
                            + ";\n"
            );
        }
        return result;
    }

    @Override
    public AttributeContainer visitBlockStatement(MiniJavaParser.BlockStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        currentEnvironment = new Environment(currentEnvironment);
        result.appendToCode("{\n");
        for(MiniJavaParser.StatementContext statementContext: ctx.statement()){
            AttributeContainer statementAttributeContainer = visit(statementContext);
            result.appendToCode(
                    statementAttributeContainer.getCode()
            );
        }
        result.appendToCode("}\n");
        currentEnvironment = currentEnvironment.getParent();
        return result;
    }

    @Override
    public AttributeContainer visitIfStatement(MiniJavaParser.IfStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        List<MiniJavaParser.StatementContext> statementContexts = ctx.statement();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        AttributeContainer ifThenStatementAttributeContainer = visit(ctx.statement(0));
        if(!expressionAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error((Token) ctx.expression().getRuleContext(), "if condition must be boolean");
        }
        result.setCode(expressionAttributeContainer.getCode());
        result.appendToCode(
                "if(!"
                        + expressionAttributeContainer.getAddress()
                        + ") goto if_else_"
                        + ifIntGenerator.generate()
                        + ";\nif_then_"
                        + ifIntGenerator.getCurrent()
                        + ":\n"
        );
        result.appendToCode(ifThenStatementAttributeContainer.getCode());
        result.appendToCode("goto if_end_" + ifIntGenerator.getCurrent() + ";\n");
        result.appendToCode("if_else_" + ifIntGenerator.getCurrent() + ":\n");
        if(statementContexts.size() == 2){
            MiniJavaParser.StatementContext ifElseStatementContext = statementContexts.get(1);
            if(ifElseStatementContext != null){
                AttributeContainer ifElseStatementAttributeContainer = visit(ifElseStatementContext);
                result.appendToCode(ifElseStatementAttributeContainer.getCode());
            }
            result.appendToCode("if_end:" + ifIntGenerator.getCurrent());
        }
        return result;
    }

    @Override
    public AttributeContainer visitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(!expressionAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error((Token) ctx.expression().getRuleContext(), "while condition must be boolean");
        }
        result.appendToCode(expressionAttributeContainer.getCode());
        String loopStartLabel = "loop_start_" + whileIntGenerator.generate();
        String loopEndLabel = "loop_end_" + whileIntGenerator.getCurrent();

        loopLabels.push(new LoopLabelTuple(loopStartLabel, loopEndLabel));
        AttributeContainer statementAttributeContainer = visit(ctx.statement());
        loopLabels.pop();

        result.appendToCode(loopStartLabel + ":\n");
        result.appendToCode("if(!"
                + expressionAttributeContainer.getAddress()
                + ") goto "
                + loopEndLabel
                + ";");

        result.appendToCode(statementAttributeContainer.getCode());
        result.appendToCode("goto " + loopStartLabel + ";");

        result.appendToCode(loopEndLabel
                + ":\n");
        return result;
    }

    @Override
    public AttributeContainer visitDoWhileStatement(MiniJavaParser.DoWhileStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(!expressionAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error((Token) ctx.expression().getRuleContext(), "do while condition must be boolean");
        }
        String loopStartLabel = "do_while_start_" + doWhileIntGenerator.generate();
        String loopEndLabel = "do_while_end_" + doWhileIntGenerator.getCurrent();
        loopLabels.push(new LoopLabelTuple(loopStartLabel, loopEndLabel));
        AttributeContainer statementAttributeContainer = visit(ctx.statement());
        loopLabels.pop();

        result.appendToCode(loopStartLabel + ":\n");
        result.appendToCode(statementAttributeContainer.getCode());
        result.appendToCode(expressionAttributeContainer.getCode());
        result.appendToCode(
                "if("
                        + expressionAttributeContainer.getAddress()
                        + ") goto "
                        + loopStartLabel
                        + ";\n"
                        + loopEndLabel
                        + ":\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitForStatement(MiniJavaParser.ForStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        String loopStartLabel = "for_start_" + forIntGenerator.generate();
        String loopEndLabel = "for_end_" + forIntGenerator.getCurrent();
        currentEnvironment = new Environment(currentEnvironment);
        if(ctx.forInit() != null){
            AttributeContainer forInitAttributeContainer = visit(ctx.forInit());
            result.appendToCode(forInitAttributeContainer.getCode());
        }
        result.appendToCode(loopStartLabel + ":\n");
        String condition = "true";
        if(ctx.expression() != null){
            AttributeContainer conditionAttributeContainer = visit(ctx.expression());
            if(!conditionAttributeContainer.getJavaType().equals("boolean")){
                errorHandler.error((Token) ctx.expression().getRuleContext(), "for condition must be boolean");
            }
            result.appendToCode(
                    conditionAttributeContainer.getCode()
            );
            condition = conditionAttributeContainer.getAddress();
        }
        result.appendToCode(
                "if (!"
                        + condition
                        + ") goto"
                        + loopEndLabel
                        + ";\n"
        );
        loopLabels.push(new LoopLabelTuple(loopStartLabel, loopEndLabel));
        AttributeContainer loopBodyAttributeContainer = visit(ctx.statement());
        loopLabels.pop();
        result.appendToCode(loopBodyAttributeContainer.getCode());
        if(ctx.forUpdate() != null){
            AttributeContainer forUpdateAttributeContainer = visit(ctx.forUpdate());
            result.appendToCode(forUpdateAttributeContainer.getCode());
        }
        result.appendToCode("goto " + loopStartLabel + ";\n");
        result.appendToCode(loopEndLabel + ":\n");
        currentEnvironment = currentEnvironment.getParent();
        return result;
    }

    @Override
    public AttributeContainer visitBreakStatement(MiniJavaParser.BreakStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        if(loopLabels.empty()){
            errorHandler.error(ctx.start, "break statement must be in a loop");
        }
        result.setCode(
                "goto "
                        + loopLabels.peek().getLoopEndLabel()
                        + ";\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitContinueStatement(MiniJavaParser.ContinueStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        if(loopLabels.empty()){
            errorHandler.error(ctx.start, "continue statement must be in a loop");
        }
        result.setCode(
                "goto "
                + loopLabels.peek().getLoopStartLabel()
                + ";\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitReturnNothingStatement(MiniJavaParser.ReturnNothingStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        if(currentMethod.getJavaType().equals("void")){
            result.setCode("return;\n");
        }
        else{
            errorHandler.error(ctx.start,
                    "must return an object of type: "
                            + currentMethod.getJavaType()
                            + " but nothing is returned"
                    );
        }
        return result;
    }

    @Override
    public AttributeContainer visitReturnExpressionStatement(MiniJavaParser.ReturnExpressionStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(currentMethod.getJavaType().equals(expressionAttributeContainer.getJavaType())){
            result.appendToCode(expressionAttributeContainer.getMethodsCode());
            result.appendToCode("return " + expressionAttributeContainer.getAddress() + ";\n");
        }
        else{
            errorHandler.error((Token) ctx.expression().getRuleContext(),
                    "must return an object of type: "
                            + currentMethod.getJavaType()
                            + " but returned an object of type: "
                            + expressionAttributeContainer.getJavaType()
                    );
        }
        return result;
    }


    @Override
    public AttributeContainer visitVariableDeclaration(MiniJavaParser.VariableDeclarationContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer typeAttributeContainer = visit(ctx.type());
        if(currentEnvironment.containsSymbolName(ctx.ID().getText())){
            errorHandler.error((Token) ctx.getRuleContext(), " variable " + ctx.ID().getText() + " already declared in this scope");
        }
        else{
            currentEnvironment.putSymbol(
                    new Symbol(
                            ctx.ID().getText(),
                            "variable",
                            typeAttributeContainer.getJavaType(),
                            typeAttributeContainer.getcType()
                    )
            );
        }
        result.setCode(
                typeAttributeContainer.getcType()
                + " "
                + ctx.ID().getText()
                + ";\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitVariableDeclarationAssignment(MiniJavaParser.VariableDeclarationAssignmentContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer typeAttributeContainer = visit(ctx.type());
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(currentEnvironment.containsSymbolName(ctx.ID().getText())){
            errorHandler.error((Token) ctx.getRuleContext(), " variable " + ctx.ID().getText() + " already declared in this scope");
        }
        else{
            currentEnvironment.putSymbol(
                    new Symbol(
                            ctx.ID().getText(),
                            "variable",
                            typeAttributeContainer.getJavaType(),
                            typeAttributeContainer.getcType()
                    )
            );
        }
        String cast = "";
        if(!expressionAttributeContainer.getJavaType().equals(typeAttributeContainer.getJavaType())){
            if(doesExtend(expressionAttributeContainer.getJavaType(), typeAttributeContainer.getJavaType())){
                cast = "(" + MiniJavaToCTypeConvertor.convert(typeAttributeContainer.getJavaType()) + ") ";
            }
            else{
                errorHandler.error(ctx.start,
                        " assigning value of type: "
                                + expressionAttributeContainer.getJavaType()
                                + " to variable with type: "
                                + typeAttributeContainer.getJavaType()
                );
            }
        }
        result.appendToCode(expressionAttributeContainer.getCode());
        result.appendToCode(
                typeAttributeContainer.getcType()
                        + " "
                        + ctx.ID().getText()
                        + " = "
                        + cast
                        + expressionAttributeContainer.getAddress()
                        + ";\n"
        );
        return result;
    }

    public AttributeContainer visitVariableToAssign(TerminalNode ID){
        AttributeContainer result = new AttributeContainer();
        Resolvation<Symbol> resolvedVariable = resolveVariable(ID.getText());
        if(resolvedVariable == null) {
            errorHandler.error((Token) ID, "variable " + ID.getText() + " not defined");
        }
        else{
            result.setJavaType(resolvedVariable.getSymbol().getJavaType());
            result.setcType(resolvedVariable.getSymbol().getcType());
            result.setAddress(resolvedVariable.getAccessCode());
        }
        return result;

    }

    public AttributeContainer visitVariableAsExpression(TerminalNode ID){
        AttributeContainer result = visitVariableToAssign(ID);
        tempIntGenerator.generate();
        result.appendToCode(
                result.getcType()
                + " "
                + tempVariablePrefix
                + tempIntGenerator.getCurrent()
                + " = "
                + result.getAddress()
                + ";\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitAssignment(MiniJavaParser.AssignmentContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        Resolvation<Symbol> resolvedVariable = resolveVariable(ctx.ID().getText());
        result.appendToCode(expressionAttributeContainer.getCode());
        if(resolvedVariable == null){
            errorHandler.error(ctx.start, " variable " + ctx.ID().getText() + " not defined");
        }
        else{
            String cast = "";
            if(!expressionAttributeContainer.getJavaType().equals(resolvedVariable.getSymbol().getJavaType())){
                if(doesExtend(expressionAttributeContainer.getJavaType(), resolvedVariable.getSymbol().getJavaType())){
                    cast = "(" + MiniJavaToCTypeConvertor.convert(resolvedVariable.getSymbol().getJavaType()) + ") ";
                }
                else if(
                        resolvedVariable.getSymbol().isObject() && expressionAttributeContainer.getJavaType().equals("null")
                ){
                    // do nothing, everything is ok
                }
                else{
                    errorHandler.error(ctx.start,
                            " assigning value of type: "
                                    + expressionAttributeContainer.getJavaType()
                                    + " to variable with type: "
                                    + resolvedVariable.getSymbol().getJavaType()
                    );
                }
            }
            result.appendToCode(
                            ctx.ID().getText()
                            + " = "
                            + cast
                            + expressionAttributeContainer.getAddress()
                            + ";\n"
            );
        }
        return result;
    }

    @Override
    public AttributeContainer visitVariableMulDivModAddAssignment(MiniJavaParser.VariableMulDivModAddAssignmentContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        Resolvation<Symbol> resolvedVariable = resolveVariable(ctx.ID().getText());
        result.appendToCode(expressionAttributeContainer.getCode());
        if(resolvedVariable == null){
            errorHandler.error(ctx.start, " variable " + ctx.ID().getText() + " not resolved");
        }
        if(!expressionAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.expression().start,
                    "operation '"
                            + ctx.op.getText()
                            + "' is only applicable for int expressions, but its type is: "
                            + expressionAttributeContainer.getJavaType()
            );
        }
        if(resolvedVariable != null && !resolvedVariable.getSymbol().getJavaType().equals("int")){
            errorHandler.error((Token) ctx.ID(),
                    "operation '"
                            + ctx.op.getText()
                            + "' is only applicable for int variables, but its type is:"
                            + resolvedVariable.getSymbol().getJavaType()
            );
            result.setCode(
                    ctx.ID().getText()
                            + " "
                            + ctx.op.getText()
                            + " "
                            + expressionAttributeContainer.getAddress()
                            + ";\n"
            );
        }
        return result;
    }

    @Override
    public AttributeContainer visitFieldAssignment(MiniJavaParser.FieldAssignmentContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer fieldHaverAttributeContainer = visit(ctx.fieldHaver);
        AttributeContainer valueAttributeContainer = visit(ctx.value);
        result.appendToCode(fieldHaverAttributeContainer.getCode());
        result.appendToCode(valueAttributeContainer.getCode());
        if(fieldHaverAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.start, "int has no fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("int[]")){
            errorHandler.error(ctx.start, "int[] objects have no assignable fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(ctx.start, "boolean has no fields");
        }
        else if(
                classEnvironments.containsKey(fieldHaverAttributeContainer.getJavaType()) &&
                        !valueAttributeContainer.getJavaType().isEmpty()
        ){
            Resolvation<Symbol> resolvedField = resolveField(ctx.ID().getText(), fieldHaverAttributeContainer.getJavaType());
            if(resolvedField == null){
                errorHandler.error((Token) ctx.ID(),
                        "objects of type "
                                + fieldHaverAttributeContainer.getJavaType()
                                + " do not have field "
                                + ctx.ID().getText()
                );
            }
            else{
                String cast = "";
                if(!valueAttributeContainer.getJavaType().equals(resolvedField.getSymbol().getJavaType())){
                    if(doesExtend(valueAttributeContainer.getJavaType(), resolvedField.getSymbol().getJavaType())){
                        cast = "(" + MiniJavaToCTypeConvertor.convert(resolvedField.getSymbol().getJavaType()) + ") ";
                    }
                    else if(
                        resolvedField.getSymbol().isObject() && valueAttributeContainer.getJavaType().equals("null")
                    ){
                        // do nothing, everything is ok
                    }
                    else{
                        errorHandler.error(ctx.start,
                                " assigning value of type: "
                                        + valueAttributeContainer.getJavaType()
                                        + " to variable with type: "
                                        + resolvedField.getSymbol().getJavaType()
                        );
                    }
                }
                result.appendToCode(
                        fieldHaverAttributeContainer.getAddress()
                        + resolvedField.getAccessCode()
                        + " = "
                        + cast
                        + valueAttributeContainer.getAddress()
                );
            }
        }
        return result;
    }

    @Override
    public AttributeContainer visitFieldMulDivModAddSubAssignment(MiniJavaParser.FieldMulDivModAddSubAssignmentContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer fieldHaverAttributeContainer = visit(ctx.fieldHaver);
        AttributeContainer valueAttributeContainer = visit(ctx.value);
        result.appendToCode(fieldHaverAttributeContainer.getCode());
        result.appendToCode(valueAttributeContainer.getCode());
        if(fieldHaverAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.start, "int has no fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("int[]")){
            errorHandler.error(ctx.start, "int[] objects have no assignable fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(ctx.start, "boolean has no fields");
        }
        else if(
                classEnvironments.containsKey(fieldHaverAttributeContainer.getJavaType()) &&
                        !valueAttributeContainer.getJavaType().isEmpty()
        ){
            Resolvation<Symbol> resolvedField = resolveField(ctx.ID().getText(), fieldHaverAttributeContainer.getJavaType());
            if(resolvedField == null){
                errorHandler.error((Token) ctx.ID(),
                        "objects of type "
                                + fieldHaverAttributeContainer.getJavaType()
                                + " do not have field "
                                + ctx.ID().getText()
                );
            }
            else{
                if(!valueAttributeContainer.getJavaType().equals("int")){
                    errorHandler.error("operation '"
                                        + ctx.op.getText()
                                        + "' is only applicable for int expressions, but its type is:"
                                        + valueAttributeContainer.getJavaType());
                }
                else if(!resolvedField.getSymbol().getJavaType().equals("int")){
                    errorHandler.error("operation '"
                            + ctx.op.getText()
                            + "' is only applicable for int variables, but its type is:"
                            + resolvedField.getSymbol().getJavaType());
                }
                else{
                    result.appendToCode(
                            fieldHaverAttributeContainer.getAddress()
                                    + resolvedField.getAccessCode()
                                    + ctx.op.getText()
                                    + valueAttributeContainer.getAddress()
                    );
                }
            }
        }
        return result;
    }

    @Override
    public AttributeContainer visitArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer arrayMemberAttributeContainer = visitArrayMemberToAssign(ctx.array, ctx.index);
        AttributeContainer valueAttributeContainer = visit(ctx.value);
        if(!valueAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.value,
                    "values to be assigned to an int array must be int, but its type is: "
                            + valueAttributeContainer.getJavaType());
        }
        result.appendToCode(arrayMemberAttributeContainer.getCode());
        result.appendToCode(valueAttributeContainer.getCode());
        result.appendToCode(
                arrayMemberAttributeContainer.getAddress()
                        + " "
                        + ctx.op.getText()
                        + " "
                        + valueAttributeContainer.getAddress()
                        + ";\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitParameterListDeclar(MiniJavaParser.ParameterListDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(int i = 0; i < ctx.parameter().size(); i++){
            MiniJavaParser.ParameterContext parameterContext = ctx.parameter(i);
            AttributeContainer parameterAttributeContainer = visit(parameterContext);
            String parameterAddress = parameterAttributeContainer.getAddress();
            if(result.getParameterList().contains(parameterAddress)){
                errorHandler.error((ParserRuleContext) ctx.parameter(i).getRuleContext(), " repetitive parameter");
            }
            result.getParameterList().add(parameterAttributeContainer.getAddress());
            result.getJavaTypeList().add(parameterAttributeContainer.getJavaType());
            result.getcTypeList().add(parameterAttributeContainer.getcType());
        }
        return result;
    }

    @Override
    public AttributeContainer visitVariableDeclarationStatement(MiniJavaParser.VariableDeclarationStatementContext ctx) {
        return visit(ctx.varDeclar());
    }

    @Override
    public AttributeContainer visitVariableDeclarationWithAssignmentStatement(MiniJavaParser.VariableDeclarationWithAssignmentStatementContext ctx) {
        return visit(ctx.varDeclarAssign());
    }

    @Override
    public AttributeContainer visitVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        return visit(ctx.assign());
    }

    @Override
    public AttributeContainer visitVariableMulDivModAddSubAssignmentStatement(MiniJavaParser.VariableMulDivModAddSubAssignmentStatementContext ctx) {
        return visit(ctx.variableMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitFieldAssignmentStatement(MiniJavaParser.FieldAssignmentStatementContext ctx) {
        return visit(ctx.fieldAssign());
    }

    @Override
    public AttributeContainer visitFieldMulDivModAddSubAssignmentStatement(MiniJavaParser.FieldMulDivModAddSubAssignmentStatementContext ctx) {
        return visit(ctx.fieldMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitArrayMemberMulDivModAddSubAssignmentStatement(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentStatementContext ctx) {
        return visit(ctx.arrayMemberMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AttributeContainer visitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(!expressionAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.expression().start, "only int variables can be printed");
        }
        result.appendToCode(expressionAttributeContainer.getCode());
        result.appendToCode(
                "printf(\"%d\", "
                    + expressionAttributeContainer.getAddress()
                    + ");\n"
        );
        return result;
    }

    @Override
    public AttributeContainer visitForInitParts(MiniJavaParser.ForInitPartsContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(MiniJavaParser.ForInitPartContext forInitPartContext: ctx.forInitPart()){
            AttributeContainer forInitPartAttributeContainer = visit(forInitPartContext);
            result.appendToCode(
                forInitPartAttributeContainer.getCode()
            );
        }
        return result;
    }

    @Override
    public AttributeContainer visitForInitPartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForInitPartArrayMemberMulDivModAddSubAssignmentContext ctx) {
        return visit(ctx.arrayMemberMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitForInitPartAssignment(MiniJavaParser.ForInitPartAssignmentContext ctx) {
        return visit(ctx.assign());
    }

    @Override
    public AttributeContainer visitForInitPartExpression(MiniJavaParser.ForInitPartExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AttributeContainer visitForInitPartFieldAssignment(MiniJavaParser.ForInitPartFieldAssignmentContext ctx) {
        return visit(ctx.fieldAssign());
    }

    @Override
    public AttributeContainer visitForInitPartFieldMulDivModAddSubAssignment(MiniJavaParser.ForInitPartFieldMulDivModAddSubAssignmentContext ctx) {
        return visit(ctx.fieldMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitForInitPartVariableDeclaration(MiniJavaParser.ForInitPartVariableDeclarationContext ctx) {
        return visit(ctx.varDeclar());
    }

    @Override
    public AttributeContainer visitForInitPartVariableDeclarationAssignment(MiniJavaParser.ForInitPartVariableDeclarationAssignmentContext ctx) {
        return visit(ctx.varDeclarAssign());
    }

    @Override
    public AttributeContainer visitForInitPartVariableMulDivModAddSubAssignment(MiniJavaParser.ForInitPartVariableMulDivModAddSubAssignmentContext ctx) {
        return visit(ctx.variableMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitForUpdateParts(MiniJavaParser.ForUpdatePartsContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(MiniJavaParser.ForUpdatePartContext forUpdatePartContext: ctx.forUpdatePart()){
            AttributeContainer forUpdatePartAttributeContainer = visit(forUpdatePartContext);
            result.appendToCode(
                    forUpdatePartAttributeContainer.getCode()
            );
        }
        return result;
    }

    @Override
    public AttributeContainer visitForUpdatePartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext ctx) {
        return visit(ctx.arrayMemberMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitForUpdatePartAssignment(MiniJavaParser.ForUpdatePartAssignmentContext ctx) {
        return visit(ctx.assign());
    }

    @Override
    public AttributeContainer visitForUpdatePartExpression(MiniJavaParser.ForUpdatePartExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AttributeContainer visitForUpdatePartFieldAssignment(MiniJavaParser.ForUpdatePartFieldAssignmentContext ctx) {
        return visit(ctx.fieldAssign());
    }

    @Override
    public AttributeContainer visitForUpdatePartFieldMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartFieldMulDivModAddSubAssignmentContext ctx) {
        return visit(ctx.fieldMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitForUpdatePartVariableMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartVariableMulDivModAddSubAssignmentContext ctx) {
        return visit(ctx.variableMulDivModAddSubAssign());
    }

    @Override
    public AttributeContainer visitParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AttributeContainer visitNewIntArrayExpression(MiniJavaParser.NewIntArrayExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(!expressionAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(
                    ctx.expression().start,
                    "array size must be int, but its type is: "
                            + expressionAttributeContainer.getJavaType()
            );
        }
        result.appendToCode(expressionAttributeContainer.getCode());
        tempIntGenerator.generate();
        result.appendToCode(
                "struct int_array* "
                    + tempVariablePrefix
                    + tempIntGenerator.getCurrent()
                    + " = "
                    + "new_int_array("
                    + expressionAttributeContainer.getAddress()
                    + ");\n"
        );
        result.setJavaType("int[]");
        result.setcType("struct int_array*");
        return result;
    }

    @Override
    public AttributeContainer visitNewObjectExpression(MiniJavaParser.NewObjectExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        if(!classEnvironments.containsKey(ctx.ID().getText())){
            errorHandler.error(
                    (Token) ctx.ID(),
                    " no class named "
                            + ctx.ID().getText()

            );
        }
        tempIntGenerator.generate();
        result.appendToCode(
                "struct "
                        + ctx.ID().getText()
                        + "* "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + "new_"
                        + currentClass
                        + "();\n"
        );
        result.setAddress(
                tempVariablePrefix
                        + tempIntGenerator.getCurrent()
        );
        result.setJavaType(ctx.ID().getText());
        result.setJavaType(
                "struct "
                        + ctx.ID().getText()
                        + "*"
        );
        return result;
    }

    @Override
    public AttributeContainer visitFieldIncrementDecrementExpression(MiniJavaParser.FieldIncrementDecrementExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer fieldHaverAttributeContainer = visit(ctx.fieldHaver);
        result.appendToCode(fieldHaverAttributeContainer.getCode());
        if(fieldHaverAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.start, "int has no fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("int[]")){
            errorHandler.error(ctx.start, "int[] objects have no assignable fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(ctx.start, "boolean has no fields");
        }
        else if(
                classEnvironments.containsKey(fieldHaverAttributeContainer.getJavaType())
        ){
            Resolvation<Symbol> resolvedField = resolveField(ctx.ID().getText(), fieldHaverAttributeContainer.getJavaType());
            if(resolvedField == null){
                errorHandler.error((Token) ctx.ID(),
                        "objects of type "
                                + fieldHaverAttributeContainer.getJavaType()
                                + " do not have field "
                                + ctx.ID().getText()
                );
            }
            else if(!resolvedField.getSymbol().getJavaType().equals("int")){
                errorHandler.error((Token) ctx.ID(),
                            "operation '"
                                    + ctx.op.getText()
                                    + "' is only applicable on integers, but it is of type: "
                                    + resolvedField.getSymbol().getJavaType()
                        );
            }
            else{
                tempIntGenerator.generate();
                result.setJavaType("int");
                result.setcType("int");
                result.appendToCode(
                        fieldHaverAttributeContainer
                        + resolvedField.getAccessCode()
                        + ctx.op.getText()
                        + ";\n"
                );
                result.appendToCode(
                        tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + fieldHaverAttributeContainer
                        + resolvedField.getAccessCode()
                        + ";\n"

                );
            }
        }
        return result;
    }


    @Override
    public AttributeContainer visitFieldExpression(MiniJavaParser.FieldExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer fieldHaverAttributeContainer = visit(ctx.fieldHaver);
        result.appendToCode(fieldHaverAttributeContainer.getCode());
        if(fieldHaverAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(ctx.start, "int has no fields");
        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("int[]")){
            if(ctx.ID().getText().equals("length")){
                result.setJavaType("int");
                result.setcType("int");
                tempIntGenerator.generate();
                result.appendToCode(
                        tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + fieldHaverAttributeContainer.getAddress()
                        + "->length;\n"
                );
                result.setAddress(
                        tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                );
            }
            else{
                errorHandler.error((Token) ctx.ID(), " int[] objects only have length field");
            }

        }
        else if(fieldHaverAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(ctx.start, "boolean has no fields");
        }
        else if(
                classEnvironments.containsKey(fieldHaverAttributeContainer.getJavaType())
        ){
            Resolvation<Symbol> resolvedField = resolveField(ctx.ID().getText(), fieldHaverAttributeContainer.getJavaType());
            if(resolvedField == null){
                errorHandler.error((Token) ctx.ID(),
                        "objects of type "
                                + fieldHaverAttributeContainer.getJavaType()
                                + " do not have field "
                                + ctx.ID().getText()
                );
            }
            else{
                tempIntGenerator.generate();
                result.appendToCode(
                             tempVariablePrefix
                                     + tempIntGenerator.getCurrent()
                                     + " = "
                                     + fieldHaverAttributeContainer.getAddress()
                                     + resolvedField.getAccessCode()
                                     + ";\n"
                );
                result.setJavaType(resolvedField.getSymbol().getJavaType());
                result.setcType(resolvedField.getSymbol().getcType());
                result.setAddress(
                        tempVariablePrefix
                                + tempIntGenerator.getCurrent()
                );
            }
        }
        return result;
    }

    @Override
    public AttributeContainer visitIdExpression(MiniJavaParser.IdExpressionContext ctx) {
        return visitVariableAsExpression(ctx.ID());
    }

    @Override
    public AttributeContainer visitIdIncrementDecrementExpression(MiniJavaParser.IdIncrementDecrementExpressionContext ctx) {
        AttributeContainer result = visitVariableToAssign(ctx.ID());
        if(!result.getJavaType().equals("int")){
            errorHandler.error((Token) ctx.ID(),
                    "operation '"
                            + ctx.op.getText()
                            + "' is applicable on int variables, but its type is: "
                            + result.getJavaType()
            );
        }
        tempIntGenerator.generate();
        result.appendToCode(
                "int "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + ctx.op.getText()
                        + result.getAddress()
                        + ";\n"
        );
        result.setAddress(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
        );
        return result;
    }

    public AttributeContainer visitArrayMemberToAssign(MiniJavaParser.ExpressionContext arrayExpression,
                                                       MiniJavaParser.ExpressionContext indexExpression){
        AttributeContainer result = new AttributeContainer();
        AttributeContainer arrayExpressionAttributeContainer = visit(arrayExpression);
        AttributeContainer indexExpressionAttributeContainer = visit(indexExpression);
        if(!arrayExpressionAttributeContainer.getJavaType().equals("int[]")){
            errorHandler.error(
                    arrayExpression.start,
                    "is not of type int[] and can not be indexed, its type is: "
                    + arrayExpressionAttributeContainer.getJavaType()
            );
        }
        if(!indexExpressionAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(
                    indexExpression.start,
                    "index must be an int, but its type is: "
                            + indexExpressionAttributeContainer.getJavaType()
            );
        }

        result.appendToCode(
                arrayExpressionAttributeContainer.getCode()
        );
        result.appendToCode(
                indexExpressionAttributeContainer.getCode()
        );
        result.setJavaType("int");
        result.setcType("int");
        result.setAddress(
                arrayExpressionAttributeContainer.getAddress()
                        + "->data["
                        + indexExpressionAttributeContainer.getAddress()
                        + "]"
        );
        return result;
    }

    public AttributeContainer visitArrayMemberAsExpression(MiniJavaParser.ExpressionContext arrayExpression,
                                                           MiniJavaParser.ExpressionContext indexExpression){
        AttributeContainer result = visitArrayMemberToAssign(arrayExpression, indexExpression);
        tempIntGenerator.generate();
        result.appendToCode(
                "int "
                     + tempVariablePrefix
                     + tempIntGenerator.getCurrent()
                     + " = "
                     + result.getAddress()
                     + ";\n"
        );
        result.setAddress(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
        );
        return result;
    }

    @Override
    public AttributeContainer visitArrayMemberIncrementDecrementExpression(MiniJavaParser.ArrayMemberIncrementDecrementExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer arrayAttributeContainer = visitArrayMemberToAssign(ctx.array, ctx.index);
        result.setJavaType("int");
        result.setJavaType("int");
        result.appendToCode(
                arrayAttributeContainer.getCode()
        );
        result.appendToCode(
                arrayAttributeContainer.getAddress()
                + ctx.op.getText()
                + ";\n"
        );
        tempIntGenerator.generate();
        result.appendToCode(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
                + " = "
                + arrayAttributeContainer.getAddress()
        );

        return result;
    }

    @Override
    public AttributeContainer visitArrayMemberExpression(MiniJavaParser.ArrayMemberExpressionContext ctx) {
        return visitArrayMemberAsExpression(ctx.array, ctx.index);
    }

    @Override
    public AttributeContainer visitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer methodHaverAttributeContainer = visit(ctx.methodHaver);
        AttributeContainer argumentListAttributeContainer = visit(ctx.argumentList());
        result.appendToCode(methodHaverAttributeContainer.getCode());
        result.appendToCode(argumentListAttributeContainer.getCode());

        if (
                methodHaverAttributeContainer.getJavaType().equals("int") ||
                        methodHaverAttributeContainer.getJavaType().equals("boolean") ||
                        methodHaverAttributeContainer.getJavaType().equals("void") ||
                        methodHaverAttributeContainer.getJavaType().equals("int[]")
        ) {
            errorHandler.error(
                    ctx.methodHaver.start,
                    methodHaverAttributeContainer.getJavaType()
                    + " has no methods"
            );
        }
        else{
            Resolvation<MethodSymbol> resolvedMethod = resolveMethod(
                    ctx.ID().getText(),
                    methodHaverAttributeContainer.getJavaType(),
                    argumentListAttributeContainer.getJavaTypeList()
            );
            if(resolvedMethod == null){
                errorHandler.error(
                        methodHaverAttributeContainer.getJavaType()
                        + " has no method with signature: "
                        + MethodSymbol.getSignatureToResolve(ctx.ID().getText(), argumentListAttributeContainer.getJavaTypeList())
                );
                return result;
            }
            else{
                tempIntGenerator.generate();
                result.appendToCode(
                        resolvedMethod.getSymbol().getcType()
                                + tempVariablePrefix
                                + tempIntGenerator.getCurrent()
                                + " = "
                                + methodHaverAttributeContainer.getAddress()
                                + resolvedMethod.getAccessCode()
                                + "("
                                + methodHaverAttributeContainer.getAddress()
                );
                for(AttributeContainer argumentAttributeContainer: argumentListAttributeContainer.getArgumentList()){
                    result.appendToCode(
                            ", "
                                    + argumentAttributeContainer.getAddress()
                    );
                }
                result.appendToCode(");\n");
                result.setJavaType(resolvedMethod.getSymbol().getJavaType());
                result.setcType((resolvedMethod.getSymbol().getcType()));
                result.setAddress(
                        tempVariablePrefix
                                + tempIntGenerator.getCurrent()
                );
            }
        }
        return result;
    }

    @Override
    public AttributeContainer visitNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(!expressionAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(
                    ctx.expression().start,
                    " ! operation is only applicable on boolean expressions"
                    + " but its type is: "
                    + expressionAttributeContainer.getJavaType()
            );
        }
        tempIntGenerator.generate();
        result.appendToCode(expressionAttributeContainer.getCode());
        result.appendToCode(
                "bool "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + "!"
                        + expressionAttributeContainer.getAddress()
                        + ";\n"
        );
        result.setJavaType("boolean");
        result.setcType("bool");
        result.setAddress(
                tempVariablePrefix
                        + tempIntGenerator.getCurrent()
        );

        return result;
    }

    @Override
    public AttributeContainer visitMinusExpression(MiniJavaParser.MinusExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer expressionAttributeContainer = visit(ctx.expression());
        if(!expressionAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(
                    ctx.expression().start,
                    " - operation is only applicable on int expressions"
                            + " but its type is: "
                            + expressionAttributeContainer.getJavaType()
            );
        }
        tempIntGenerator.generate();
        result.appendToCode(expressionAttributeContainer.getCode());
        result.appendToCode(
                "bool "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + "(-"
                        + expressionAttributeContainer.getAddress()
                        + ")"
                        + ";\n"
        );
        result.setJavaType("boolean");
        result.setcType("bool");
        result.setAddress(
                tempVariablePrefix
                        + tempIntGenerator.getCurrent()
        );

        return result;
    }

    @Override
    public AttributeContainer visitIntegerBinaryExpression(MiniJavaParser.IntegerBinaryExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer leftSideAttributeContainer = visit(ctx.leftSide);
        AttributeContainer rightSideAttributeContainer = visit(ctx.rightSide);
        if(!leftSideAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(
                    ctx.leftSide,
                            ctx.op.getText()
                                    + " operation is only applicable on int expressions"
                                    + " but its type is: "
                                    + leftSideAttributeContainer.getJavaType()
            );
        }
        if(!rightSideAttributeContainer.getJavaType().equals("int")){
            errorHandler.error(
                    ctx.rightSide,
                    ctx.op.getText()
                            +" operation is only applicable on int expressions"
                            + " but its type is: "
                            + rightSideAttributeContainer.getJavaType()
            );
        }
        result.appendToCode(leftSideAttributeContainer.getCode());
        result.appendToCode(rightSideAttributeContainer.getCode());
        tempIntGenerator.generate();
        result.appendToCode(
                "int "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + leftSideAttributeContainer.getAddress()
                        + ctx.op.getText()
                        + rightSideAttributeContainer.getAddress()
                        +";\n"
        );
        result.setJavaType("int");
        result.setcType("int");
        result.setAddress(
                tempVariablePrefix
                        + tempIntGenerator.getCurrent()
        );
        return result;

    }

    @Override
    public AttributeContainer visitBooleanExpression(MiniJavaParser.BooleanExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer leftSideAttributeContainer = visit(ctx.leftSide);
        AttributeContainer rightSideAttributeContainer = visit(ctx.rightSide);
        if(!leftSideAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(
                    ctx.leftSide.start,
                    "boolean operation "
                            + ctx.op.getText()
                            + " is only applicable on boolean expressions"
                            + " but left side type is: "
                            + leftSideAttributeContainer.getJavaType()
            );
        }
        if(!rightSideAttributeContainer.getJavaType().equals("boolean")){
            errorHandler.error(
                    ctx.rightSide.start,
                    "boolean operation "
                            + ctx.op.getText()
                            + " is only applicable on boolean expressions"
                            + " but right side type is: "
                            + rightSideAttributeContainer.getJavaType()
            );
        }
        tempIntGenerator.generate();
        result.appendToCode(leftSideAttributeContainer.getCode());
        result.appendToCode(rightSideAttributeContainer.getCode());
        result.appendToCode(
                "bool "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + leftSideAttributeContainer.getAddress()
                        + " "
                        + ctx.op.getText()
                        + " "
                        + rightSideAttributeContainer.getAddress()
                        + ";\n"
        );
        result.setJavaType("boolean");
        result.setcType("bool");
        result.setAddress(
                tempVariablePrefix
                        + tempIntGenerator.getCurrent()
        );
        return result;
    }

    @Override
    public AttributeContainer visitThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        tempIntGenerator.generate();
        result.appendToCode(
                "struct "
                + currentClass
                + "* "
                + tempVariablePrefix
                + tempIntGenerator
                + " = "
                + "caller_"
                + currentClass
                + ";\n"
        );
        result.setAddress(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
        );
        result.setcType("struct " + currentClass + "*");
        result.setJavaType(currentClass);
        return result;
    }

    @Override
    public AttributeContainer visitArgumentListDeclar(MiniJavaParser.ArgumentListDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(MiniJavaParser.ExpressionContext expressionContext: ctx.expression()){
            AttributeContainer expressionAttributeContainer = visit(expressionContext);
            result.getArgumentList().add(expressionAttributeContainer);
            result.appendToCode(expressionAttributeContainer.getCode());
            result.getJavaTypeList().add(expressionAttributeContainer.getJavaType());
            result.getcTypeList().add(expressionAttributeContainer.getcType());
        }
        return result;
    }

    @Override
    public AttributeContainer visitIntegerExpression(MiniJavaParser.IntegerExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        tempIntGenerator.generate();
        result.appendToCode(
                "int "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + ctx.INTEGER().getText()
                        + ";\n"
        );
        result.setAddress(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
        );
        result.setcType("int");
        result.setJavaType("int");
        return result;
    }

    @Override
    public AttributeContainer visitTrueFalseExpression(MiniJavaParser.TrueFalseExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        tempIntGenerator.generate();
        result.appendToCode(
                "bool "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = "
                        + ctx.value.getText()
                        + ";\n"
        );
        result.setAddress(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
        );
        result.setcType("bool");
        result.setJavaType("boolean");
        return result;
    }

    @Override
    public AttributeContainer visitNullExpression(MiniJavaParser.NullExpressionContext ctx) {
        AttributeContainer result = new AttributeContainer();
        tempIntGenerator.generate();
        result.appendToCode(
                "void* "
                        + tempVariablePrefix
                        + tempIntGenerator.getCurrent()
                        + " = NULL;\n"
        );
        result.setJavaType("null");
        result.setcType("void*");
        result.setAddress(
                tempVariablePrefix
                + tempIntGenerator.getCurrent()
        );
        return result;
    }

    @Override
    public AttributeContainer visitParameterDeclar(MiniJavaParser.ParameterDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer typeAttributeContainer = visit(ctx.type());
        result.setAddress(ctx.ID().getText());
        result.setJavaType(typeAttributeContainer.getJavaType());
        result.setcType(typeAttributeContainer.getcType());
        return result;
    }

    @Override
    public AttributeContainer visitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setJavaType("boolean");
        result.setcType(MiniJavaToCTypeConvertor.convert("boolean"));
        return result;
    }

    @Override
    public AttributeContainer visitIntType(MiniJavaParser.IntTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setJavaType("int");
        result.setcType(MiniJavaToCTypeConvertor.convert("int"));
        return result;
    }

    @Override
    public AttributeContainer visitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setJavaType("int[]");
        result.setcType(MiniJavaToCTypeConvertor.convert("int[]"));
        return result;
    }

    @Override
    public AttributeContainer visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx) {
        if(!classEnvironments.containsKey(ctx.ID().getText())){
            errorHandler.error(ctx.ID().getSymbol(), "class " + ctx.ID().getText() + " is not defined");
        }
        AttributeContainer result = new AttributeContainer();
        result.setJavaType(ctx.ID().getText());
        result.setcType(MiniJavaToCTypeConvertor.convert(ctx.ID().getText()));
        return result;
    }
}
