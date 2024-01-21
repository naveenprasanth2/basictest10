package org.example.practise3;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindArmstrongNumber {
    public static void main(String[] args) {
//        double number = 1634;
//        int count = String.valueOf(number).split("[.]")[0].length();
//        double finalVal = Stream.of(String.valueOf(number).split("[.]")[0].split(""))
//                .mapToDouble(Double::valueOf)
//                .map(x -> (int) Math.pow(x, count)).sum();
//        System.out.println(number);
//        System.out.println(finalVal);

        int number = 1634;
        int power = getPower(number);
        int sum = 0;
        while (number > 0) {
            int val = number % 10;
            int factor = 1;
            for (int i = 0; i < power; i++) {
                factor *= val;
            }
            sum += factor;
            number /= 10;
        }

        System.out.println(sum);

    }

    static int getPower(int num) {
        int power = 0;
        if (num > 1) {
            while (num > 0) {
                num /= 10;
                power++;
            }
            return power;
        } else {
            return 1;
        }
    }
}
