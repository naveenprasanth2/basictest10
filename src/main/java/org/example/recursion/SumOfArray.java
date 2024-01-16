package org.example.recursion;

public class SumOfArray {
    static int sum = 0;
    static int[] a = {1, 2, 3, 4, 56};

    public static void main(String[] args) {
        System.out.println(sumOfElements(4));
    }

    static int sumOfElements(int index) {
        System.out.println(index);
        if (index == 0) {
            return a[index];
        } else {
            sum = a[index] + sumOfElements(index - 1);
        }
        return sum;
    }
}
