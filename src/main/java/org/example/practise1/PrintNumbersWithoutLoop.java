package org.example.practise1;

import java.util.Arrays;

public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        Object[] arr = new Object[100];

        Arrays.fill(arr, new Object(){
            int count = 0;
            @Override
            public String toString(){
                return String.valueOf(++count);
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
