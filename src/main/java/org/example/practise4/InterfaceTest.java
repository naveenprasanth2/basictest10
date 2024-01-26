package org.example.practise4;

public class InterfaceTest implements InterfaceDemo{

     @Override
     public void summa() {

     }

     @Override
     public void summa1() {
          InterfaceDemo.super.summa1();
     }

     public static void main(String[] args) {
          InterfaceTest interfaceTest = new InterfaceTest();
          interfaceTest.test();
     }
}
