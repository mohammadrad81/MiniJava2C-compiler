package org.example.MiniJavaAntlrImp;

import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import java.util.*;

public class MiniJavaCompiler extends MiniJavaBaseVisitor<AttributeContainer> {
//    private final Map<String, Environment> classEnvironments = new HashMap<>();
//    private final ErrorHandler errorHandler = new ErrorHandler();
//

//
//    @Override
//    public AttributeContainer visitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx) {
//        List<AttributeContainer> classAttributeContainers = new LinkedList<>();
//        for(MiniJavaParser.ClassDeclarationContext classDeclarationContext: ctx.classDeclaration()){
//            classAttributeContainers.add(visit(classDeclarationContext));
//        }
//        AttributeContainer mainClassAttributeContainer = visit(ctx.mainClass());
//        classAttributeContainers.add(mainClassAttributeContainer);
//        AttributeContainer result = AttributeContainer.appendCodes(classAttributeContainers);
//        if(result == null){
//            return null;
//        }
//        result.setCode(headersCode() + intArrayCode() + result.getCode());
//        return result;
//    }
//
//    @Override
//    public AttributeContainer visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx) {
//        if (!classEnvironments.containsKey(ctx.superClass.getText())){
//            errorHandler.error(ctx.superClass, "class still not defined: " + ctx.superClass.getText());
//            return null;
//        }
//        Environment parentEnvironment = null;
//        String superField = "";
//        if(ctx.superClass != null){
//            parentEnvironment = classEnvironments.get(ctx.superClass.getText());
//            superField = "struct " + ctx.superClass + " super;\n";
//        }
//        classEnvironments.put(ctx.className.getText(), new Environment(parentEnvironment, new TreeMap<>()));
//        AttributeContainer classBodyAttributeContainer = visit(ctx.classBody());
//        String structDefinitionCode = "struct "
//                + ctx.className
//                + " {\n" + superField
//                + classBodyAttributeContainer.getStructDefinitionCode()
//                + "\n}\n";
//
//    }
//
//    @Override
//    public AttributeContainer visitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx) {
//        return null;
//    }
}
