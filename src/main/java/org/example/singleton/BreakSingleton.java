package org.example.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);


        Class<?> singletonClass = Class.forName("org.example.singleton.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton brokenSingleton = constructor.newInstance();
        System.out.println(brokenSingleton);
    }
}
