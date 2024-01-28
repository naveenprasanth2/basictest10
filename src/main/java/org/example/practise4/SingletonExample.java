package org.example.practise4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Class<?> className = Class.forName("org.example.practise4.Singleton");
        @SuppressWarnings("unchecked")
        Constructor<Singleton> constructor = (Constructor<Singleton>) className.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
        System.out.println(constructor.hashCode());
    }
}
