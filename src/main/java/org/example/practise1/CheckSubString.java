package org.example.practise1;

public class CheckSubString {
    public static void main(String[] args) {
        String a = "naveen is a good boy";
        String sub = "boy";

        System.out.println(a.matches(".*" + sub + ".*"));
        sub = "summa";
        System.out.println(a.matches(".*" + sub + ".*"));
    }
}
