package org.example.MiniJavaAntlrImp;

import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MiniJavaCompiler extends MiniJavaBaseVisitor<AttributeContainer> {
    private final Map<String, Environment> classEnvironment = new HashMap<>();
    @Override
    public AttributeContainer visitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx) {
        List<AttributeContainer> classAttributeContainers = new LinkedList<>();
        for(MiniJavaParser.ClassDeclarationContext classDeclarationContext: ctx.classDeclaration()){
            classAttributeContainers.add(visit(classDeclarationContext));
        }
        AttributeContainer mainClassAttributeContainer = visit(ctx.mainClass());
        classAttributeContainers.add(mainClassAttributeContainer);
//        return AttributeContainer.appendCodes(classAttributeContainers);
        return null;
    }

    @Override
    public AttributeContainer visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx) {
        System.out.println("class declaration seen: " + ctx.className);
        return null;
    }

    @Override
    public AttributeContainer visitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx) {
        System.out.println("Main class: " + ctx.ID(0));
        return null;
    }
}
