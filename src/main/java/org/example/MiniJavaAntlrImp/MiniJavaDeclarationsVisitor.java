package org.example.MiniJavaAntlrImp;

import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import java.util.HashMap;
import java.util.Map;

public class MiniJavaDeclarationsVisitor extends MiniJavaBaseVisitor<AttributeContainer> {
    private Map<String, Environment> classEnvironments = new HashMap<>();
    private ErrorHandler errorHandler = new ErrorHandler();

    public void setClassEnvironments(Map<String, Environment> classEnvironments) {
        this.classEnvironments = classEnvironments;
    }

    private String currentClass;
    private Environment currentEnvironment;

    public Map<String, Environment> getClassEnvironments() {
        return classEnvironments;
    }

    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public String headersCode(){
        return """
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
""";
    }

    public String intArrayCode(){
            return """
struct int_array {
    int length;
    int* data;
}
    
struct int_array* new_int_array(int size){
    struct int_array* array = (struct int_array*) malloc(sizeof(struct int_array));
    array->length = size;
    array->data = (int*) calloc(size, sizeof(int));
    return array;
}
""";
    }

    @Override
    public AttributeContainer visitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setCode(
                headersCode()
                        + "\n"
                        + intArrayCode()
        );
        for(MiniJavaParser.ClassDeclarationContext classDeclarationContext: ctx.classDeclaration()){
            AttributeContainer classDeclarationAttributeContainer = visit(classDeclarationContext);
            result.appendToStructDefinitionCode(
                    "\n"
                            + classDeclarationAttributeContainer.getStructDefinitionCode()
            );
            result.appendToConstructorCodes(
                            classDeclarationAttributeContainer.getConstructorsCode()
            );
            result.appendToMethodsCode(
                            classDeclarationAttributeContainer.getMethodsCode()
            );
        }
        result.appendToCode(
                        result.getStructDefinitionCode()
                        + result.getConstructorsCode()
                        + result.getMethodsCode()
        );
        return result;
    }

    @Override
    public AttributeContainer visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        if(
                ctx.superClass != null &&
                !classEnvironments.containsKey(ctx.superClass.getText())
        ){
            errorHandler.error(ctx.superClass, "super class not defined: " + ctx.superClass.getText());
        }

        Environment parent = null;

        String superFieldText = "";

        if(ctx.superClass != null){
            superFieldText = "\nstruct " + ctx.superClass.getText() + " super;";
        }
        currentClass = ctx.className.getText();
        Environment currentClassEnvironment = classEnvironments.get(currentClass);
        currentEnvironment = currentClassEnvironment;
        classEnvironments.put(ctx.className.getText(), currentClassEnvironment);

        result.setStructDefinitionCode(
                "struct "
                        + ctx.className.getText()
                        +"{"
                        + superFieldText
                        + "\n//fields"
        );
        AttributeContainer classBodyAttributeContainer = visit(ctx.classBody());
        result.appendToStructDefinitionCode(
                classBodyAttributeContainer.getStructDefinitionCode()
                +"}\n"
        );
        result.setMethodsCode(
                classBodyAttributeContainer.getMethodsCode()
        );

        result.setConstructorsCode(
                classBodyAttributeContainer.getConstructorsCode()
        );
        return result;
    }

    @Override
    public AttributeContainer visitClasssBodyDeclar(MiniJavaParser.ClasssBodyDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(MiniJavaParser.FieldDeclarationContext fieldDeclarationContext: ctx.fieldDeclaration()){
            AttributeContainer fieldAttributeContainer = visit(fieldDeclarationContext);
            result.appendToStructDefinitionCode(
                    "\n"
                    + fieldAttributeContainer.getStructDefinitionCode()
            );
        }
        result.appendToStructDefinitionCode("\n\n//methods");
        for(MiniJavaParser.MethodDeclarationContext methodDeclarationContext: ctx.methodDeclaration()){
            AttributeContainer methodAttributeContainer = visit(methodDeclarationContext);
            result.appendToStructDefinitionCode(
                    "\n"
                    + methodAttributeContainer.getStructDefinitionCode()
            );
            result.appendToMethodsCode(
                    "\n"
                    + methodAttributeContainer.getMethodsCode()
            );
        }
        result.appendToStructDefinitionCode("\n");
        result.appendToConstructorCodes(
                "\nstruct "
                        + currentClass
                        + "* new_"
                        + currentClass
                        + "();"
        );
        return result;
    }

    @Override
    public AttributeContainer visitFieldDeclar(MiniJavaParser.FieldDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer typeAttributes = visit(ctx.type());
        String javaType = typeAttributes.getJavaType();
        String cType = typeAttributes.getcType();
        currentEnvironment.putSymbol(
                new Symbol(
                        ctx.fieldName.getText(),
                        "field",
                        javaType,
                        cType
                )
        );
        result.appendToStructDefinitionCode(
                typeAttributes.getcType()
                + " "
                + ctx.fieldName.getText()
                + ";"
        );
        return result;
    }

    @Override
    public AttributeContainer visitMethodDeclar(MiniJavaParser.MethodDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        String returnCType = "void";
        String returnJavaType = "void";
        if(ctx.type() != null){
            AttributeContainer returnTypeAttributeContainer = visit(ctx.type());
            returnCType = returnTypeAttributeContainer.getcType();
            returnJavaType = returnTypeAttributeContainer.getJavaType();
        }
        AttributeContainer parameterListAttributeContainer = visit(ctx.parameterList());
        StringBuilder structCode = new StringBuilder(returnCType
                + " (*"
                + "function_"
                + ctx.methodName.getText()
                + ")(void*");

        StringBuilder methodCode = new StringBuilder(returnCType
                + " "
                + currentClass
                + "_function_"
                + ctx.methodName.getText()
                + "(void*");
        MethodSymbol methodSymbol = new MethodSymbol(
                ctx.methodName.getText(),
                "method",
                returnJavaType,
                returnCType,
                parameterListAttributeContainer.getJavaTypeList()
        );
        currentEnvironment.putMethodSymbol(methodSymbol);
        int parameterListSize = parameterListAttributeContainer.getcTypeList().size();
        for(int i = 0; i < parameterListSize; i++){
            String parameterType = parameterListAttributeContainer.getcTypeList().get(i);
            structCode.append(", ");
            methodCode.append(", ");
            structCode.append(parameterType);
            methodCode.append(parameterType);
        }
        structCode.append(");");
        methodCode.append(");");
        result.setStructDefinitionCode(structCode.toString());
        result.setMethodsCode(methodCode.toString());

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
    public AttributeContainer visitParameterListDeclar(MiniJavaParser.ParameterListDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        for(MiniJavaParser.ParameterContext parameterContext: ctx.parameter()){
            AttributeContainer parameterAttributeContainer = visit(parameterContext);
            result.getParameterList().add(parameterAttributeContainer.getAddress());
            result.getJavaTypeList().add(parameterAttributeContainer.getJavaType());
            result.getcTypeList().add(parameterAttributeContainer.getcType());
        }
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
