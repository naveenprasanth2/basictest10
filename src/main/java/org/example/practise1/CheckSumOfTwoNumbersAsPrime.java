package org.example.practise1;

import java.util.ArrayList;
import java.util.List;

public class CheckSumOfTwoNumbersAsPrime {

    static List<Integer> test;

    static {
        test = new ArrayList<>();
    }

    public static void main(String[] args) {
        int num = 35;
        boolean isFound = false;
        for (int i = 1; i <= num; i++) {
            if (checkPrime(i)) {
                test.add(i);
            }
        }

        for (int i = 0; i < test.size() - 1; i++) {
            for (int j = i + 1; j < test.size() - 1; j++) {
                if (test.get(i) + test.get(j) == num) {
                    isFound = true;
                    System.out.println("the numbers are :" + test.get(i) + " " + test.get(j));
                }
            }
        }

        if (!isFound){
            System.out.println("No such matches are found");
        }
    }

    static boolean checkPrime(int num) {
        boolean val = true;
        if (num == 1) {
            return val;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    val = false;
                    return val;
                }
            }
        }
        return val;
    }
}
