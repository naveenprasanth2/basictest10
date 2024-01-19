package org.example.practise2;

import java.util.Arrays;

public class CheckStringsAreEqual {
    public static void main(String[] args) {
        String first = "naveen";
        String last = "neevan";

        char[] firstArray = first.toCharArray();
        char[] lastArray = last.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(lastArray);

        System.out.println(Arrays.equals(firstArray, lastArray));
    }
}
