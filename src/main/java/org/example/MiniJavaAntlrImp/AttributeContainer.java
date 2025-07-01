package org.example.MiniJavaAntlrImp;

import java.util.ArrayList;
import java.util.List;

public class AttributeContainer {
    private String code = "";
    private String structDefinitionCode = "";
    private String constructorsCode = "";
    private String methodsCode = "";
    private String address = "";
    private String javaType = "";
    private String cType = "";
    private List<String> cTypeList = new ArrayList<>();
    private List<String> javaTypeList = new ArrayList<>();

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

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
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

    public List<String> getcTypeList() {
        return cTypeList;
    }

    public void setcTypeList(List<String> cTypeList) {
        this.cTypeList = cTypeList;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public List<String> getJavaTypeList() {
        return javaTypeList;
    }

    public void setJavaTypeList(List<String> javaTypeList) {
        this.javaTypeList = javaTypeList;
    }
}
