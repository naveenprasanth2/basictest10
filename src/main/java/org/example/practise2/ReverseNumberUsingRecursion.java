package org.example.practise2;

public class ReverseNumberUsingRecursion {
    public static void main(String[] args) {
        int number = 987797679;
//        reverseNumber(number);
        System.out.println(reverseNumberItself(number));
    }

    static void reverseNumber(int number) {
        if (number < 10) {
            System.out.print(number);
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    static int reverseNumberItself(int number) {
        int sum;
        if (String.valueOf(number).length() == 1) {
            return 0;
        } else {
            int multiplier = 1;
            int val = String.valueOf(number).length();
            while (val > 2) {
                multiplier *= 10;
                val--;
            }
            sum = (number % 10 * multiplier);
            return sum + reverseNumberItself(number / 10);
        }
    }
}
