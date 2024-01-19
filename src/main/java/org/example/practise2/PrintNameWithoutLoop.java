package org.example.practise2;

import java.util.Arrays;

public class PrintNameWithoutLoop {
    public static void main(String[] args) {
//        printName("naveen", 1000);
        Object[] a = new Object[1000];
        Arrays.fill(a, new Object() {
            final String name = "naveen";

            @Override
            public String toString() {
                return name;
            }
        });

        System.out.println(Arrays.toString(a));
    }

    static void printName(String name, int count) {
        if (count > 0) {
            System.out.println(name);
            printName(name, --count);
        }
    }
}
