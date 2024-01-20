package org.example.practise1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
//    public static void main(String[] args) {
//        String[] a = {"cat", "mat", "bat", "mat", "cat"};
//        List<String> test = Stream.of(a).toList();
//        List<String> result = new ArrayList<>();
//       test.stream().filter(x -> !result.contains(x)).forEach(result::add);
//        System.out.println(result);
//    }

//    public static void main(String[] args) {
//        String[] a = {"cat", "mat", "bat", "mat", "cat"};
//        HashSet<String> set = new HashSet<>(Stream.of(a).toList());
//        System.out.println(set);
//    }

    public static void main(String[] args) {
        String[] a = {"cat", "mat", "bat", "mat", "cat"};
        List<Map.Entry<String, Long>> valList = Stream.of(a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().sorted((x1, x2) -> {
                    if (!Objects.equals(x1.getValue(), x2.getValue())) {
                        return ((int) (x2.getValue() - x1.getValue()));
                    } else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                }).toList();
        System.out.println(valList);
    }
}
