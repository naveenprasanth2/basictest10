package org.example.practise1;

import java.util.List;
import java.util.stream.Stream;

public class LongestBalancedString {
    public static void main(String[] args) {
        String a = "GOogleLEnsE";
        List<String> values = Stream.of(a.split("")).toList();
        List<String> result = values.stream().filter(x -> Character.isUpperCase(x.toCharArray()[0]))
                .filter(a::contains).toList();

        System.out.println(result);

        System.out.println(a.substring(values.indexOf(result.getFirst()), values.indexOf(result.getLast()) + 1));
    }
}
