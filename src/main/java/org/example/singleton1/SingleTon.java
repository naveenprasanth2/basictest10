package org.example.singleton1;

import java.io.Serializable;

public class SingleTon implements Serializable, Cloneable {

    public static volatile SingleTon singleTon;

    private SingleTon(){}

    public static SingleTon getInstance(){
        if(singleTon == null){
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

    @Override
    public SingleTon clone() {
        try {
            SingleTon clone = (SingleTon) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
