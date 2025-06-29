package org.example.MiniJavaAntlrImp;

import java.util.List;
import java.util.Objects;

public class MethodSymbol extends Symbol{

    private List<String> parametersTypes;

    public MethodSymbol(String name,
                        String kind,
                        String type,
                        List<String> parametersTypes) {
        super(name, kind, type);
        this.parametersTypes = parametersTypes;
    }

    public List<String> getParametersTypes() {
        return parametersTypes;
    }

    public void setParametersTypes(List<String> parametersTypes) {
        this.parametersTypes = parametersTypes;
    }

    public String getSignature(){
        String signature = this.getName() + "(";
        for(int i = 0; i < this.parametersTypes.size(); i++){
            signature += this.parametersTypes.get(i);
            if(i != this.parametersTypes.size() - 1){
                signature += ",";
            }
        }
        signature += ")";
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MethodSymbol that = (MethodSymbol) o;
        if(this.parametersTypes.size() != that.parametersTypes.size()){
            return false;
        }
        for(int i = 0; i < this.parametersTypes.size(); i++){
            if(this.parametersTypes.get(i) != that.parametersTypes.get(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hashValue = 0;
        for(int i = 0; i < this.parametersTypes.size(); i++){
            hashValue += Objects.hash(this.parametersTypes.get(i), i);
        }
        hashValue = Objects.hash(super.hashCode(), hashValue);
        return hashValue;
    }
}
