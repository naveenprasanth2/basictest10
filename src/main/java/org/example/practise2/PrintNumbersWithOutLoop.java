package org.example.practise2;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbersWithOutLoop {
    public static void main(String[] args) {
        //method 1 using Array fill
        Object[] num = new Object[100];
        Arrays.fill(num, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });

        System.out.println(Arrays.toString(num));

        //using Bit Set

        String set = new BitSet() {{
            set(1, 101);
        }}.toString();
        System.out.println(set);
//        System.out.append(set, 1, set.length());
    }
}
