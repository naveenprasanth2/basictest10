package org.example.practise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinTwoArrays {
    public static void main(String[] args) {
        String[] a = {"naveen", "prasanth"};
        String[] b = {"test", "testing"};

        List<String> result = Stream.of(a, b).flatMap(Arrays::stream).toList();

        System.out.println(result);
        Stream<String> aStream = Arrays.stream(a);
        Stream<String> bStream = Arrays.stream(b);
        String[] fullArray = Stream.concat(aStream, bStream).toArray(String[]::new);
        System.out.println(Arrays.toString(fullArray));
    }
}
