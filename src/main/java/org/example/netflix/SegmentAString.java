package org.example.netflix;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SegmentAString {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        Set<String> finalSet = new HashSet<>();
        dictionary.add("apple");
        dictionary.add("pen");
        dictionary.add("pine");

        String s = "applepenapineplep";

        for (int i=0; i<s.length()-2; i++){
            for (int j = i+1; j<s.length() - 1; j++){
                if(dictionary.contains(s.substring(i, j))){
                    finalSet.add(s.substring(i, j));
                }
            }
        }
        System.out.println(finalSet);
    }
}
