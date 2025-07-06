package org.example.MiniJavaAntlrImp;

import java.lang.reflect.Method;
import java.util.*;

public class Environment {
    private boolean isClassEnvironment = false;
    private String className = "";
    private Environment parent;
    private final Map<String, Symbol> table;

    public Environment getParent() {
        return parent;
    }

    public Map<String, Symbol> getTable() {
        return table;
    }

    public void setParent(Environment parent) {
        this.parent = parent;
    }

    public Environment(){
        this.table = new TreeMap<>();
        this.parent = null;
    }

    public Environment(Map<String, Symbol> table){
        this.table = table;
        this.parent = null;
    }

    public Environment(Environment parent){
        this.table = new TreeMap<>();
        this.parent = parent;
    }

    public Environment(Environment parent, Map<String, Symbol> table){
        this.parent = parent;
        this.table = table;
    }

    public void putSymbol(Symbol symbol){
        this.table.put(symbol.getName(), symbol);
    }

    public void putMethodSymbol(MethodSymbol methodSymbol){
        this.table.put(methodSymbol.getSignature(), methodSymbol);
    }

    public boolean containsSymbolName(String symbolName){
        return this.table.containsKey(symbolName);
    }

    public boolean containsMethodSignature(String methodSignature){
        return this.table.containsKey(methodSignature);
    }

    public Symbol getSymbol(String name){
        for(Environment environment = this; environment != null; environment = environment.parent){
            Symbol found = (environment.table.get(name));
            if(found != null){
                return found;
            }
        }
        return null;
    }

    public List<Integer> overridingSuperIndices(MethodSymbol methodSymbol){
        List<Integer> result = new ArrayList<>();
        Environment environment = this.parent;
        for(int counter = 1; environment != null; environment = environment.parent){
            if(environment.isClassEnvironment()){
                if(environment.containsMethodSignature(methodSymbol.getSignature())){
                    result.add(counter);
                }
                counter++;
            }
        }
        return result;
    }

    public boolean isClassEnvironment() {
        return isClassEnvironment;
    }

    public void setClassEnvironment(boolean classEnvironment) {
        isClassEnvironment = classEnvironment;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
