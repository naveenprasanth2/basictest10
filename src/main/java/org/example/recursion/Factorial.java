package org.example.recursion;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(10));
    }

    static BigInteger findFactorial(int value){
        if(value > 1){
            return BigInteger.valueOf(value).multiply(findFactorial(value -1));
        }else {
            return BigInteger.valueOf(1);
        }
    }
}
