package org.example.practise2;

import java.util.BitSet;


public class PrintNumbersUsingBitSet {
    public static void main(String[] args) {
        String bitSet = new BitSet(){{set(1, 101);}}.toString();
        System.out.println(bitSet);
    }
}
