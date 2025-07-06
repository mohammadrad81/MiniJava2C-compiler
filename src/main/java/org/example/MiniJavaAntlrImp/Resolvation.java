package org.example.MiniJavaAntlrImp;

public class Resolvation<T extends Symbol>{
    private String accessCode;
    private T symbol;

    public Resolvation(String accessCode, T symbol) {
        this.accessCode = accessCode;
        this.symbol = symbol;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public T getSymbol() {
        return symbol;
    }

    public void setSymbol(T symbol) {
        this.symbol = symbol;
    }
}
