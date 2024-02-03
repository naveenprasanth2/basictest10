package org.example.singleton1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonBreakReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingleTon singleTon = SingleTon.getInstance();

        Class<SingleTon> singleTonClass = (Class<SingleTon>) Class.forName("org.example.singleton1.SingleTon");
        Constructor<?> constructor = singleTonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTon singleTon1 = (SingleTon) constructor.newInstance();

        System.out.println(singleTon1.hashCode());
        System.out.println(singleTon.hashCode());
    }
}
