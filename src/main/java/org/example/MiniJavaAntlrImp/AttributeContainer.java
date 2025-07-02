package org.example.MiniJavaAntlrImp;

import java.util.ArrayList;
import java.util.List;

public class AttributeContainer {
    private String code = "";
    private String mainCode = "";
    private String structDefinitionCode = "";
    private String constructorsCode = "";
    private String methodsCode = "";
    private String address = "";
    private String javaType = "";
    private String cType = "";
    private List<String> cTypeList = new ArrayList<>();
    private List<String> javaTypeList = new ArrayList<>();
    private List<String> argumentList = new ArrayList<>();
    private List<String> parameterList = new ArrayList<>();

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

    public void insertAtFirstOfCode(String text){
        this.code = text + this.code;
    }

    public void appendToStructDefinitionCode(String text){
        this.structDefinitionCode += text;
    }

    public void insertAtFirstOfStructDefinitionCode(String text){
        this.structDefinitionCode = text + this.structDefinitionCode;
    }

    public void appendToConstructorCodes(String text){
        this.constructorsCode += text;
    }

    public void insertAtFirstOfConstructorCode(String text){
        this.constructorsCode = text + this.constructorsCode;
    }

    public void appendToMethodsCode(String text){
        this.methodsCode += text;
    }

    public void insertAtFirstOfMethodsCode(String text){
        this.methodsCode = text + this.methodsCode;
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

    public String getMainCode() {
        return mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode;
    }

    public List<String> getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(List<String> argumentList) {
        this.argumentList = argumentList;
    }

    public List<String> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<String> parameterList) {
        this.parameterList = parameterList;
    }
}
