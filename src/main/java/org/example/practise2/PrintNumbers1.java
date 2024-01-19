package org.example.practise2;

import java.util.Arrays;

public class PrintNumbers1 {

    public static void main(String[] args) {

        Object[] a = new Object[100];

        Arrays.fill(a, new Object(){
            int num = 0;
            @Override
            public String toString(){
                return String.valueOf(++num);
            }
        });
        System.out.println(Arrays.toString(a));
    }
}
