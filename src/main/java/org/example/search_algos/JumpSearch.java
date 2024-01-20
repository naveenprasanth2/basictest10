package org.example.search_algos;

public class JumpSearch {
    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    static int numToFind = 15;

    static int index = -1;

    public static void main(String[] args) {
        findNumber((int) Math.sqrt(a.length - 1));
    }

    static void findNumber(int right) {
        if (a[right] == numToFind) {
            System.out.println(right);
        }
        if (a[right] > numToFind) {
            int count = (right - (int) Math.sqrt(a.length - 1)) == 0 ? right : (int) Math.sqrt(a.length - 1);
            while (count > 0) {
                --right;
                if (a[right] == numToFind) {
                    System.out.println(right);
                    index = -1;
                }
                --count;
            }
        } else if (a[right] < numToFind && (right < a.length - 1)) {
            findNumber(Math.min((right + (int) Math.sqrt(a.length - 1)), (a.length - 1)));
        }else {
            System.out.println(index);
        }
    }
}
