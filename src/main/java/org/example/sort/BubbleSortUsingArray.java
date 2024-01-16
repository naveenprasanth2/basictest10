package org.example.sort;

import java.util.Arrays;

public class BubbleSortUsingArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7, 2, 2};
        int temp;

        for (int i = 0; i<a.length; i++){
            for (int j = 1; j<a.length -i; j++){
                if(a[j-1] > a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
