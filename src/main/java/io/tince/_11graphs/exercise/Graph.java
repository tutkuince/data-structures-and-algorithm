package io.tince._11graphs.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, List<String>> adjList = new HashMap<>();

    public Map<String, List<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    // WRITE ADD VERTEX METHOD HERE//
    //                             //
    //                             //
    //                             //
    //                             //
    /////////////////////////////////
    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
}
