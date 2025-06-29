package org.example.MiniJavaAntlrImp;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Environment {
    private final Environment parent;
    private final Map<String, Symbol> table;

    public Environment(Map<String, Symbol> table){
        this.table = table;
        this.parent = null;
    }

    public Environment(Environment parent){
        this.table = new HashMap<>();
        this.parent = parent;
    }

    public Environment(Environment parent, Map<String, Symbol> table){
        this.parent = parent;
        this.table = table;
    }

    public void putSymbol(Symbol symbol) throws Exception {
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
            Symbol found = (Symbol) (environment.table.get(name));
            if(found != null){
                return found;
            }
        }
        return null;
    }
}
