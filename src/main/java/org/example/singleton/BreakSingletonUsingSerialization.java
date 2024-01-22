package org.example.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonUsingSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Singleton s1 = Singleton.getInstance();
//
//        //serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(".\\test.ser"));
        objectOutputStream.writeObject(s1);

        //deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(".\\test.ser"));
        Singleton s2 = (Singleton) objectInputStream.readObject();

        System.out.println(s1);
        System.out.println(s2);

        Class<?> singletonClass = Class.forName("org.example.singleton.Singleton");
        Constructor<Singleton> singletonConstructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        Singleton s3 = singletonConstructor.newInstance();
        System.out.println(s3);
    }
}
