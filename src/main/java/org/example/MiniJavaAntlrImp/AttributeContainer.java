package org.example.MiniJavaAntlrImp;

import java.util.List;

public class AttributeContainer {
    private String code = "";
    private String structDefinitionCode = "";
    private String constructorsCode = "";
    private String methodsCode = "";
    private String address = "";
    private String type = "";

    public static AttributeContainer appendCodes(List<AttributeContainer> attributeContainers){

        AttributeContainer result = new AttributeContainer();
        for(AttributeContainer attributeContainer: attributeContainers){
            if(attributeContainer == null){
                return null;
            }
            result.setCode(result.getAddress() + "\n" + attributeContainer.getCode() + "\n");
        }
        return result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMethodsCode() {
        return methodsCode;
    }

    public void setMethodsCode(String methodsCode) {
        this.methodsCode = methodsCode;
    }

    public String getStructDefinitionCode() {
        return structDefinitionCode;
    }

    public void setStructDefinitionCode(String structDefinitionCode) {
        this.structDefinitionCode = structDefinitionCode;
    }

    public String getConstructorsCode() {
        return constructorsCode;
    }

    public void setConstructorsCode(String constructorsCode) {
        this.constructorsCode = constructorsCode;
    }

    public void appendToCode(String text){
        this.code += text;
    }

    public void appendToStructDefinitionCode(String text){
        this.structDefinitionCode += text;
    }

    public void appendToConstructorCodes(String text){
        this.constructorsCode += text;
    }

    public void appendToMethodsCode(String text){
        this.methodsCode += text;
    }
}
