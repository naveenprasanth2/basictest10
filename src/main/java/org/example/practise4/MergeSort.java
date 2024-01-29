package org.example.practise4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 5, 3, 7};
        splitTheArray(a);
    }

    public static void splitTheArray(int[] array) {
        int mid = array.length / 2;
        if(mid >=1){
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            int count = 0;
            for (int i = mid; i < array.length; i++) {
                right[count] = array[i];
                count++;
            }
            splitTheArray(left);
            splitTheArray(right);
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
        }
    }
}
