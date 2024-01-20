package org.example.practise1;

import java.util.Arrays;

public class AverageOfAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 255, 777};
        double average = Arrays.stream(a).boxed().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println(average);
    }
}
