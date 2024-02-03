package org.example.singleton1;

public class SingletonUsingClone {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(singleTon.hashCode());

        SingleTon singleTon1 = singleTon.clone();

        System.out.println(singleTon1.hashCode());
    }
}
