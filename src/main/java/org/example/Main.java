package org.example;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.MiniJavaAntlr.MiniJavaLexer;
import org.example.MiniJavaAntlr.MiniJavaParser;
import org.example.MiniJavaAntlrImp.AttributeContainer;
import org.example.MiniJavaAntlrImp.MiniJavaCompiler;
import org.example.MiniJavaAntlrImp.MiniJavaDeclarationsCompiler;

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
}

class Dog{
    int x;
    Animal animal;
}""";

        ANTLRInputStream input = new ANTLRInputStream(program);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);

        ParseTree tree = parser.program();
        MiniJavaDeclarationsCompiler visitor = new MiniJavaDeclarationsCompiler();
        AttributeContainer container = visitor.visit(tree);
        System.out.println(container.getCode());
    }


}