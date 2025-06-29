package org.example;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.MiniJavaAntlr.MiniJavaLexer;
import org.example.MiniJavaAntlr.MiniJavaParser;
import org.example.MiniJavaAntlrImp.AttributeContainer;
import org.example.MiniJavaAntlrImp.MiniJavaCompiler;

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

public class Animal{
    int id;
}

public class Dog extends Animal{
    public Dog(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}""";

        ANTLRInputStream input = new ANTLRInputStream(program);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);

        ParseTree tree = parser.program();
        MiniJavaCompiler visitor = new MiniJavaCompiler();
        AttributeContainer container = visitor.visit(tree);

    }


}