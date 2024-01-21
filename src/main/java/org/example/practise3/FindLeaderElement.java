package org.example.practise3;

import java.util.ArrayList;
import java.util.List;

public class FindLeaderElement {
    public static void main(String[] args) {
        int[] a = {120, 15, 1, 5, 4, 7, 53, 4, 8, 9, 0, 5};
        List<Integer> test = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                test.add(a[i]);
            }
        }

        System.out.println(test);
    }
}
