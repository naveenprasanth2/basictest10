package org.example.practise4;

public interface InterfaceDemo {

    private void test() {
        System.out.println("test method working fine");
    }

    void summa();

//    static void wow(){
//    test();
//    }

    default void summa1() {
        test();
    }

    static void testing(){

    }

}
