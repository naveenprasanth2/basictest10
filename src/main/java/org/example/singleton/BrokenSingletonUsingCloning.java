package org.example.singleton;

public class BrokenSingletonUsingCloning {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        Singleton s2 = s1.clone();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
