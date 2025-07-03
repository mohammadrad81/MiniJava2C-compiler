package org.example.MiniJavaAntlrImp;

public class MiniJavaToCTypeConvertor {
    public static String convert(String javaType){
        if(javaType.equals("int")){
            return "int";
        }
        else if(javaType.equals("boolean")){
            return "bool";
        }
        else if(javaType.equals("int[]")){
            return "struct int_array*";
        }
        else{
            return "struct " + javaType +"*";
        }
    }
}
