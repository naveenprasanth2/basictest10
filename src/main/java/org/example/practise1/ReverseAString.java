package org.example.practise1;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "naveen";
        List<String> test = new java.util.ArrayList<>(Stream.of(a.split("")).toList());
        Collections.reverse(test);
        StringJoiner stringJoiner = new StringJoiner("", "", "");
        test.forEach(stringJoiner::add);
        System.out.println(stringJoiner);
    }
}
