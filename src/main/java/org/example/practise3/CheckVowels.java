package org.example.practise3;

import java.util.ArrayList;
import java.util.List;

public class CheckVowels {

    static List<Character> vowelList;

    static {
        vowelList = new ArrayList<>();
    }
    public static void main(String[] args) {

        List<Character> test = List.of('a', 'l', 'e', 'A', 'i', 'O');
        test.forEach(CheckVowels::checkIsVowel);
        System.out.println(vowelList);
    }

    static void checkIsVowel(char character){
        switch (Character.toLowerCase(character)){
            case 'a', 'e', 'i', 'o', 'u' -> vowelList.add(character);
        }
    }
}
