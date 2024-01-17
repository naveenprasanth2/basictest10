package org.example.recursion;

public class FindFibonacci {
    public static void main(String[] args) {
        findFibonacci(15, 0, 0);
    }

    static void findFibonacci(int desired, int next, int count) {
        if (desired > count) {
            if (next == 0) {
                System.out.printf(next + "\t");
            } else {
                System.out.printf(next + "\t");
                findFibonacci(desired, ++next, ++count);
            }
        }
    }
}
