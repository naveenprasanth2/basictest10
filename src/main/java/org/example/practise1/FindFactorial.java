package org.example.practise1;

import java.math.BigInteger;

public class FindFactorial {
    static BigInteger factorialVal = BigInteger.valueOf(1);

    public static void main(String[] args) {
        int num = 100;
        findFactorial(num);
        System.out.println(factorialVal);
    }

    static void findFactorial(int num) {
        factorialVal = factorialVal.multiply(BigInteger.valueOf(num));
        if(num > 2){
            findFactorial(num - 1);
        }
    }
}
