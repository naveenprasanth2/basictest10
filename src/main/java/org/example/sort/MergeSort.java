package org.example.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {4, 5, 33, 5, 5, 3};
        sort(a);
    }

    static void sort(int[] arr) {
        if (arr.length > 1) {
            int middle = arr.length / 2;
            int[] left = new int[middle];
            int[] right = new int[arr.length - middle];
            for (int i = 0; i < middle; i++) {
                left[i] = arr[i];
            }
            for (int i = middle; i < arr.length; i++) {
                right[i - middle] = arr[i];
            }
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
            sort(left);
            sort(right);
        }
    }

    static void merge(int[] left, int[] right) {
        int[] mergedArr = new int[left.length + right.length];
        int min;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {

            }
        }
    }
}
