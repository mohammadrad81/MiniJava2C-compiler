package org.example.MiniJavaAntlrImp;

import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import javax.management.Attribute;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MiniJavaDeclarationsCompiler extends MiniJavaBaseVisitor<AttributeContainer> {
    private final Map<String, Environment> classEnvironments = new HashMap<>();
    private final ErrorHandler errorHandler = new ErrorHandler();

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
                    "\n"
                            + classDeclarationAttributeContainer.getConstructorsCode()
            );
            result.appendToMethodsCode(
                    "\n"
                            + classDeclarationAttributeContainer.getMethodsCode()
            );
        }
        result.appendToCode(
                "\n"
                        + result.getStructDefinitionCode()
                        + result.getConstructorsCode()
                        + result.getMethodsCode()
        );
        return result;
    }

    @Override
    public AttributeContainer visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        if(classEnvironments.containsKey(ctx.className.getText())){
            errorHandler.error(ctx.className, "duplicate class declaration: " + ctx.className.getText());
        }
        if(
                ctx.superClass != null &&
                !classEnvironments.containsKey(ctx.superClass.getText())
        ){
            errorHandler.error(ctx.superClass, "super class not defined: " + ctx.superClass.getText());
        }

        result.setStructDefinitionCode(
                "struct "
                        + ctx.className.getText()
                        + "{\n"
        );

        Environment parent = null;

        if(ctx.superClass != null){
            parent = this.classEnvironments.get(ctx.superClass.getText());
        }
        Environment currentClassEnvironment = new Environment(parent);
        currentClass = ctx.className.getText();
        currentEnvironment = currentClassEnvironment;

        AttributeContainer classBodyAttributeContainer = visit(ctx.classBody());
        result.appendToStructDefinitionCode(
                classBodyAttributeContainer.getStructDefinitionCode()
                +"\n}\n"
        );
        result.setMethodsCode(
                classBodyAttributeContainer.getMethodsCode()
        );

        result.setConstructorsCode(
                classBodyAttributeContainer.getMethodsCode()
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
        result.appendToStructDefinitionCode("\n");
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
        return result;
    }

    @Override
    public AttributeContainer visitFieldDeclar(MiniJavaParser.FieldDeclarContext ctx) {
        AttributeContainer result = new AttributeContainer();
        AttributeContainer typeAttributes = visit(ctx.type());
        String type = typeAttributes.getType();
        String codeType = null;
        currentEnvironment.putSymbol(
                new Symbol(
                        ctx.fieldName.getText(),
                        "feature",
                        type
                )
        );
        if(type.equals("boolean")){
            codeType = "bool";
        }
        else if(type.equals("int")){
            codeType = "int";
        }
        else if(type.equals("int[]")){
            codeType = "struct int_array*";
        }
        else { // ID
            codeType = "struct " + type + "*";
        }
        result.appendToStructDefinitionCode(
                codeType
                + " "
                + ctx.fieldName.getText()
                + ";"
        );
        return result;
    }

    @Override
    public AttributeContainer visitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setType("boolean");
        return result;
    }

    @Override
    public AttributeContainer visitIntType(MiniJavaParser.IntTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setType("int");
        return result;
    }

    @Override
    public AttributeContainer visitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx) {
        AttributeContainer result = new AttributeContainer();
        result.setType("int[]");
        return result;
    }

    @Override
    public AttributeContainer visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx) {
        if(!classEnvironments.containsKey(ctx.ID().getText())){
            errorHandler.error(ctx.ID().getSymbol(), "class " + ctx.ID().getText() + "is not defined");
        }
        AttributeContainer result = new AttributeContainer();
        result.setType(ctx.ID().getText());
        return result;
    }


}
