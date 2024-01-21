package org.example.practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ShiftZerosToRight {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 7, 0, 89, 0, 7};
        List<Integer> test = new ArrayList<>(Arrays.stream(a).boxed().filter(x -> x!=0).toList());
        int size = test.size();
        IntStream.rangeClosed(1, a.length - size).forEach(x -> test.add(0));
        System.out.println(test);
        int[] i = new int[10];
        System.out.println(Arrays.toString(i));
    }
}
