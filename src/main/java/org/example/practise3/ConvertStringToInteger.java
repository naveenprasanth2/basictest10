package org.example.practise3;

import java.util.List;
import java.util.stream.Stream;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String s = "123";
        List<Integer> test = Stream.of(s.split("")).map(x -> x.toCharArray()[0]).map(x -> (int) x - 48).toList();
        System.out.println(test);
    }
}
