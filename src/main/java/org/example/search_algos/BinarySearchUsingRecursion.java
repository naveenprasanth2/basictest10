package org.example.search_algos;

public class BinarySearchUsingRecursion {
    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    static int numberToFind = 9;

    public static void main(String[] args) {
        int right = a.length - 1;
        int left = 0;
        findTheNumber(left, right);
    }

    static void findTheNumber(int left, int right) {
        int middle = (right + left) / 2;
        if (left <= right) {
            if (a[middle] == numberToFind) {
                System.out.println(middle);
            } else if (a[middle] > numberToFind) {
                right = middle - 1;
                findTheNumber(left, right);
            } else if (a[middle] < numberToFind) {
                left = middle + 1;
                findTheNumber(left, right);
            }
        }
    }
}
