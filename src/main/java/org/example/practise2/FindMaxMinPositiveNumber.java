package org.example.practise2;

public class FindMaxMinPositiveNumber {

    public static void findMaxNumber(int a, int b, int c) {
        int max = 0;
        while (a > 0 || b > 0 || c > 0) {
            a--;
            b--;
            c--;
            max++;
        }
        System.out.println(max);
    }

    public static void findMaxUsingFunction(int a, int b, int c) {
        System.out.println(Math.max(c, Math.max(a, b)));
    }

    public static void findMinNumber(int a, int b, int c) {
        int min = 0;
        while (a > 0 && b > 0 && c > 0) {
            a--;
            b--;
            c--;
            min++;
        }
        System.out.println(min);
    }


    public static void main(String[] args) {
//        findMaxNumber(2,3,6);
//        findMaxUsingFunction(2, 3, 6);
        findMinNumber(0,3,6);
    }
}
