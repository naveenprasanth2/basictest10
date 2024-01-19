package org.example.search_algos;

public class BinarySearchUsingWhile {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int numberToFind = 14;
        int left = 0;
        int right = a.length - 1;
        int middle;
        int index = -1;

        while (left <= right) {
            middle = left + right / 2;
            if (a[middle] == numberToFind) {
                index = middle;
                break;
            } else if (a[middle] > numberToFind) {
                right = middle - 1;
            } else if (a[middle] < numberToFind) {
                left = middle + 1;
            }
        }
        System.out.println(index);
    }
}
