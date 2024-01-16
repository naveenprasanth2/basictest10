package org.example.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 2, 2, 1};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}
