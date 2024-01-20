package org.example.practise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LengthOfAString {
    public static void main(String[] args) {
        String a = "Naveen";
      List<String>  test = new ArrayList<>(Stream.of(a.split("")).toList());
      int count = 0;
      while (!test.isEmpty()){
          count++;
          test.removeFirst();
      }
        System.out.println(Stream.of(a.split("")).count());
        System.out.println(count);
    }
}
