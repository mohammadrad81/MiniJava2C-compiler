package org.example.MiniJavaAntlrImp;

import java.util.*;

public class Hierarchy {


    private Set<String> nodes;
    private Map<String, String> extensions;

    public Hierarchy(Set<String> nodes, Map<String, String> extension) {
        this.nodes = nodes;
        this.extensions = extension;
    }

    public Hierarchy() {
        this.nodes = new TreeSet<>();
        this.extensions = new TreeMap<>();
    }

    public boolean hasNode(String node){
        return this.nodes.contains(node);
    }

    public void insertNode(String node){
        this.nodes.add(node);
    }

    public void insertExtension(String source, String destination){

        this.extensions.put(source, destination);
    }

    public boolean hasLoop(){
        for(String node: this.nodes){
            if(this.hasLoopStartingNode(node)){
                return true;
            }
        }
        return false;
    }

    public boolean hasLoopStartingNode(String node){
        Set<String> visited = new TreeSet<>();
        visited.add(node);
        for(String current = this.extensions.get(node); current != null; current = this.extensions.get(current)){
            if(visited.contains(current)){
                return true;
            }
        }
        return false;
    }

    public Set<String> getNodes() {
        return nodes;
    }

    public Map<String, String> getExtensions() {
        return extensions;
    }

    public String toString(){
        StringBuilder result = new StringBuilder("nodes:\n");
        for(String node: this.nodes){
            result.append(node).append("\n");
        }
        for(String source: this.extensions.keySet()){
            String destination = this.extensions.get(source);
            result.append(source).append(" -> ").append(destination);
        }
        return result.toString();
    }
}
