package org.example.practise2;

import java.util.regex.Pattern;

public class CheckValidNumber {
    public static void main(String[] args) {
        String a = "5676765487";
        String b = "+033-8989899898";
        System.out.println(Pattern.matches("[9876][0-9]{9}", a));
        System.out.println(Pattern.matches("(\\+[0-9]{0,3}-)?[9876][0-9]{9}", b));
        checkNumber("100.80");
        checkNumber("100");
    }

    static void checkNumber(String number) {
        System.out.println(Pattern.matches("-?[0-9]*.?[0-9]+", number));
    }
}
