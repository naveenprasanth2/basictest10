package org.example.practise2;

import java.util.stream.Stream;

public class CountsWordsLinesChars {
    public static void main(String[] args) {
        String line = "naveen is a good boy\nhe may also be a bad boy\ndepending upon the situations";

        System.out.println(line);

        System.out.println(Stream.of(line.replaceAll("\\n", " ").split(" ")).count());
        System.out.println(Stream.of(line.split("")).filter(x -> x.equals("\n")).count());
        System.out.println(Stream.of(line.split("")).filter(x -> x.equals(" ")).count());
    }
}
