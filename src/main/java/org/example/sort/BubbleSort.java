package org.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7, 2, 2};
        List<Integer> test = Arrays.stream(a).boxed().collect(Collectors.toList());

        for (int i = 0; i < test.size(); i++) {
            for (int j = 1; j < (test.size()) -i; j++) {
                if(test.get(j) < test.get(j-1)){
                    int val = test.remove(j-1);
                    test.add(j, val);
                }
            }
        }
        System.out.println(test);
    }
}
