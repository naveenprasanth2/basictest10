package org.example.practise1;

import java.lang.reflect.Field;

public class AutoBot {

    static {
        Field value;
        try {
            value = String.class.getDeclaredField("value");
            value.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        try {
            value.set("hello naveen", value.get("summa"));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("hello naveen");
    }
}
