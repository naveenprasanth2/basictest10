package org.example.practise2;

public class ConvertStringToNumber {

    static void convertStringToNumber(String value) {
        int total = 0;

        for (int i = 0; i < value.length(); i++) {
            total = (total * 10) + ((int) value.charAt(i)) - 48;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        convertStringToNumber("567");
        convertStringToNumber("98989");
    }
}
