package org.example.practise2;

public class PrintNameSimply {
    public static void main(String[] args) {
        String name = "naveen";
        String s = "i";
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", name+ "\n");
        System.out.println(s);
    }
}
