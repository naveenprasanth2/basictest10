package org.example.search_algos;

public class GivenNumberIndex {
    public static void main(String[] args) {
        int number = 5;
        int index = -1;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                index = i;
                System.out.println(index);
                break;
            }
        }
        if (index == -1) {
            System.out.println(index);
        }
    }
}
