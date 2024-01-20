package org.example.practise1;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};

        List<Integer> test = Arrays.stream(arr).boxed().toList();
        int size = test.size() + 1;
        int val = (size * (size + 1)) / 2;

        int totalVal = test.stream().mapToInt(Integer::intValue).sum();

        System.out.println("The missing no is : " + (val - totalVal));
    }
}
