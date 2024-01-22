package org.example.hashmap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEvaluation {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "naveen");
        treeMap.put(2, "naveen");
        treeMap.put(7, "naveen");
        treeMap.put(5, "naveen");
        treeMap.put(8, "naveen");

        Set<Map.Entry<Integer, String>> headMap = treeMap.headMap(7).entrySet();
        Set<Map.Entry<Integer, String>> tailMap = treeMap.tailMap(7).entrySet();

        System.out.println(headMap);
        System.out.println(tailMap);
    }
}
