package org.example.MiniJavaAntlrImp;

import java.util.Objects;

public class Symbol {
    private String name;
    private String kind;
    private String type;

    public Symbol(String name, String kind, String type) {
        this.name = name;
        this.kind = kind;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol = (Symbol) o;
        return Objects.equals(name, symbol.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
