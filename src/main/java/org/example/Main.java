package org.example;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.MiniJavaAntlr.MiniJavaLexer;
import org.example.MiniJavaAntlr.MiniJavaParser;
import org.example.MiniJavaAntlrImp.*;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        String program = """
public class Main{
    public static void main(String[] args){
        Dog dog = new Dog(1);
        System.out.println(dog.getId());
    }
}

class Animal{
    int x;
    int[] y;
    public void sing(){
        System.out.println(1);
    }
}

class Dog extends Animal{
    int x;
    Animal animal;
    public Animal sayHello(int t){
        return this.animal;
    }
}""";

        ANTLRInputStream input = new ANTLRInputStream(program);
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
        AttributeContainer container = declarationVisitor.visit(tree);
        System.out.println(container.getCode());


    }


}