package org.example.practise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindVowels {

    public static void main(String[] args) {
        String a = "summa tha iruken daU";
        List<Character> characterList = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> list = new String(a.replaceAll("\\s", "").toCharArray())
                .chars().mapToObj(i -> (char) i)
                .map(Character::toLowerCase)
                .filter(characterList::contains).toList();
        System.out.println(list);


    }
}
