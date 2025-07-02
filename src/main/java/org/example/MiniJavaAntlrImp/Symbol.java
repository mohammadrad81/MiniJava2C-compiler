package org.example.MiniJavaAntlrImp;

import java.util.Objects;

public class Symbol {
    private String name;
    private String kind;
    private String javaType;
    private String cType;

    public Symbol(String name, String kind, String javaType, String cType) {
        this.name = name;
        this.kind = kind;
        this.javaType = javaType;
        this.cType = cType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
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

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }
}
