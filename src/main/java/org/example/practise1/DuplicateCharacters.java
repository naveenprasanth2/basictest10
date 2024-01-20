package org.example.practise1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String a = "naveen is a good boy";
        List<String> test = Stream.of(a.replaceAll("\\s", "").split("")).toList();
//        long count = test.stream().filter(x -> Collections.frequency(test, x) >= 2).count();
        System.out.println(test.stream().distinct().count());
//        System.out.println(count);
        HashSet<String> testSet = new HashSet<>();
        long count = test.stream().filter(x -> !testSet.add(x)).count();
        System.out.println(count);
    }
}
