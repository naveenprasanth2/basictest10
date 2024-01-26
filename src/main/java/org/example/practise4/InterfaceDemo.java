package org.example.practise4;

public interface InterfaceDemo {

    private static void test(){
        System.out.println("test method working fine");
    }
    void summa();

    static void wow(){
    test();
    }

    default void summa1(){

    }

}
