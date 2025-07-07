package org.example;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.MiniJavaAntlr.MiniJavaBaseVisitor;
import org.example.MiniJavaAntlr.MiniJavaLexer;
import org.example.MiniJavaAntlr.MiniJavaParser;
import org.example.MiniJavaAntlrImp.*;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        if(args.length == 0){
            System.err.println("Provide a program file address");
            System.exit(-1);
        }
        String programFileName = args[0];
        String fileContent = "";
        try{
            Path path = Paths.get(programFileName);
            fileContent = Files.readString(path);
        } catch(IOException e){
            e.printStackTrace();
            System.exit(-1);
        }

        ANTLRInputStream input = new ANTLRInputStream(fileContent);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);

        ParseTree tree = parser.program();

        MiniJavaClassEnvironmentVisitor classEnvironmentVisitor = new MiniJavaClassEnvironmentVisitor();
        classEnvironmentVisitor.visit(tree);
        if(classEnvironmentVisitor.getErrorHandler().hasErrors()){
            System.exit(-1);
        }
        Map<String, Environment> classEnvironments = classEnvironmentVisitor.getClassEnvironments();
        MiniJavaDeclarationsVisitor declarationVisitor = new MiniJavaDeclarationsVisitor();
        declarationVisitor.setClassEnvironments(classEnvironments);
        AttributeContainer declarationAttributeContainer = declarationVisitor.visit(tree);
        if(declarationVisitor.getErrorHandler().hasErrors()){
            System.exit(-1);
        }
        classEnvironments = declarationVisitor.getClassEnvironments();
        ErrorHandler errorHandler = declarationVisitor.getErrorHandler();
        MiniJavaImplementationVisitor miniJavaImplementationVisitor = new MiniJavaImplementationVisitor(classEnvironments, errorHandler);
        AttributeContainer implementationAttributeContainer = miniJavaImplementationVisitor.visit(tree);
        if(miniJavaImplementationVisitor.getErrorHandler().hasErrors()){
            System.exit(-1);
        }
        System.out.println(declarationAttributeContainer.getCode());
        System.out.println(implementationAttributeContainer.getCode());
    }
}