package org.example.practise2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("the random number is :" + random.nextInt(0, 10));

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println(threadLocalRandom.nextInt(0, 200));

        System.out.println(Math.random());
    }
}
