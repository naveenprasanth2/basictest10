package org.example.recursion;

public class RecursiveSum {
    static int[] a = {1, 2, 3, 4, 56};

    public static void main(String[] args) {
        System.out.println(sumOfDigits(a.length -1));
    }

    static int sumOfDigits(int n) {
        if (n == 0)
            return a[n];
        return a[n] + sumOfDigits(n - 1);
    }
}
