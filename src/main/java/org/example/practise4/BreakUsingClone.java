package org.example.practise4;

import org.example.singleton.Singleton;

public class BreakUsingClone {
    public static void main(String[] args) {
        org.example.singleton.Singleton singleton = org.example.singleton.Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Singleton singleton1 = singleton.clone();
        System.out.println(singleton1.hashCode());
    }
}
