package org.example.singleton1;

import java.io.*;

public class SingletonSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingleTon singleTon = SingleTon.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("\\sample.ser"));
        objectOutputStream.writeObject(singleTon);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("\\sample.ser"));
        SingleTon singleTon1 = (SingleTon) objectInputStream.readObject();

        System.out.println(singleTon1.hashCode());
        System.out.println(singleTon.hashCode());

    }
}
