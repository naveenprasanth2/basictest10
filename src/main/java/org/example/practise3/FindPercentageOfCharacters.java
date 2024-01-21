package org.example.practise3;

import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FindPercentageOfCharacters {
    public static void main(String[] args) {
        String name = "Naveen Automation Labs \n 668678 %#LLLLLLLLLLLLL";
        int length = name.length();
        Supplier<Stream<String>> stream = () -> Stream.of(name.split(""));
        long upperVal = stream.get().filter(x -> Pattern.matches("[A-Z]", x)).count();
        double upperPercentage = upperVal > 0 ? (double) upperVal / length : 0;
        long lowerVal = stream.get().filter(x -> Pattern.matches("[a-z]", x)).count();
        double lowerPercentage = lowerVal > 0 ? (double) lowerVal / length : 0;
        long numbersVal = stream.get().filter(x -> Pattern.matches("[0-9]", x)).count();
        double numbersPercentage = numbersVal > 0 ? (double) numbersVal / length : 0;
        long othersVal = stream.get().filter(x -> !Pattern.matches("[A-Za-z0-9]", x)).count();
        double otherPercentage = othersVal > 0 ? (double) othersVal / length : 0;

        System.out.println("upper case percentage: " + String.format("%5f", upperPercentage));
        System.out.println("lower case percentage: " + String.format("%5f", lowerPercentage));
        System.out.println("numbers case percentage: " + String.format("%5f", numbersPercentage));
        System.out.println("others case percentage: " + String.format("%5f", otherPercentage));
    }
}
