package org.example.MiniJavaAntlrImp;

public class Resolvation<T extends Symbol>{
    private String code;
    private T symbol;

    public Resolvation(String code, T symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getSymbol() {
        return symbol;
    }

    public void setSymbol(T symbol) {
        this.symbol = symbol;
    }
}
