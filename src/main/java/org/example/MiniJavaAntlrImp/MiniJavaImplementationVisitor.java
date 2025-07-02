package org.example.MiniJavaAntlrImp;

import org.antlr.v4.runtime.ParserRuleContext;
import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import java.util.*;

public class MiniJavaImplementationVisitor extends MiniJavaBaseVisitor<AttributeContainer> {
    private Map<String, Environment> classEnvironments;
    private ErrorHandler errorHandler;
    private String currentClass;
    private Environment currentEnvironment;

    public MiniJavaImplementationVisitor(Map<String, Environment> classEnvironments, ErrorHandler errorHandler) {
        this.classEnvironments = classEnvironments;
        this.errorHandler = errorHandler;
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
        for(MiniJavaParser.MethodDeclarationContext methodDeclarationContext: ctx.methodDeclaration()){
            AttributeContainer methodAttributeContainer = visit(methodDeclarationContext);
            result.appendToConstructorCodes(methodAttributeContainer.getConstructorsCode());
            result.appendToMethodsCode(methodAttributeContainer.getMethodsCode());
        }

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
            String superDot = "super.";
            result.appendToConstructorCodes(
                    "instance"
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
        result.setcType("bool");
        return result;
    }

    @Override
    public AttributeContainer visitIntType(MiniJavaParser.IntTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setJavaType("int");
        result.setcType("int");
        return result;
    }

    @Override
    public AttributeContainer visitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setJavaType("int[]");
        result.setcType("struct int_array*");
        return result;
    }

    @Override
    public AttributeContainer visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx) {
        if(!classEnvironments.containsKey(ctx.ID().getText())){
            errorHandler.error(ctx.ID().getSymbol(), "class " + ctx.ID().getText() + " is not defined");
        }
        AttributeContainer result = new AttributeContainer();
        result.setJavaType(ctx.ID().getText());
        result.setcType(
                "struct "
                        + ctx.ID().getText()
                        + "*"
        );
        return result;
    }
}
