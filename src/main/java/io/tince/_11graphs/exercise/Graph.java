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

    // WRITE ADD EDGE METHOD HERE//
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    // WRITE REMOVE EDGE METHOD HERE//
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    // WRITE REMOVE VERTEX METHOD HERE//
    //                                //
    //                                //
    //                                //
    //                                //
    ////////////////////////////////////
    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return false;
        for (String otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
