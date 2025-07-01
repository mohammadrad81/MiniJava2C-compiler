package org.example.MiniJavaAntlrImp;

import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaParser;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MiniJavaClassEnvironmentVisitor extends MiniJavaBaseVisitor<Void> {
    private Map<String, Environment> classEnvironments = new HashMap<>();
    private ErrorHandler errorHandler = new ErrorHandler();
    private Hierarchy hierarchy = new Hierarchy();

    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public Map<String, Environment> getClassEnvironments() {
        return classEnvironments;
    }

    public Hierarchy getHierarchy() {
        return hierarchy;
    }

    @Override
    public Void visitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx) {
        for(MiniJavaParser.ClassDeclarationContext classDeclarationContext: ctx.classDeclaration()) {
            visit(classDeclarationContext);
        }
        if(hierarchy.hasLoop()){
            errorHandler.error("cyclic extension");
        }

        else{
            for(String node: hierarchy.getNodes()){
                classEnvironments.put(node, new Environment(new TreeMap<>()));
            }
            for(String source: hierarchy.getExtensions().keySet()){
                String destination = hierarchy.getExtensions().get(source);
                if(!hierarchy.getNodes().contains(destination)){
                    errorHandler.error("super class not defined: " + destination);
                }
                classEnvironments.get(source).setParent(
                        classEnvironments.get(destination)
                );
            }
        }
        return null;
    }

    @Override
    public Void visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx) {
        if(ctx.superClass == null){
            this.hierarchy.insertNode(ctx.className.getText());
        }
        else{
            if(hierarchy.getNodes().contains(ctx.className.getText())){
                errorHandler.error(ctx.className, "duplicated class declaration: " + ctx.className.getText());
            }

            else{
                hierarchy.insertNode(ctx.className.getText());
                hierarchy.insertExtension(ctx.className.getText(), ctx.superClass.getText());
            }
        }
        return null;
    }
}
