package org.example.MiniJavaAntlrImp;

import java.util.List;

public class AttributeContainer {
    private String code = "";
    private String address = "";
    private String type = "";

    public static AttributeContainer appendCodes(List<AttributeContainer> attributeContainers){
        AttributeContainer result = new AttributeContainer();
        for(AttributeContainer attributeContainer: attributeContainers){
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
}
