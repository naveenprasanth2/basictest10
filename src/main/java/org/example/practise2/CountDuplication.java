package org.example.practise2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountDuplication {
    public static void main(String[] args) {
        List<String> test = List.of("naveen", "prasanth", "naveen");
        test.stream().filter(x -> Collections.frequency(test, x) >= 2).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
