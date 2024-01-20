package org.example.practise1;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountOfWordsFromCapitalList {
    public static void main(String[] args) {
        String a = "NaveenIsAGoodBoyFromHisChildhood";
//        System.out.println(a.split("[A-Z]+").length);

        System.out.println(Arrays.toString(a.split("(?=[A-Z]+)")));
//        long count = new String(a.toCharArray()).chars().filter(x -> x >= 65 && x <= 90).count();
//        System.out.println(count);
        long count = new String(a.toCharArray()).chars().filter(x -> x >= 'A' && x < 'Z').count();
        System.out.println(count);
    }
}
