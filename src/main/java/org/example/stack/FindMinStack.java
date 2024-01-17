package org.example.stack;

import java.util.Stack;

public class FindMinStack {
   static Stack<Integer> mainStack;
   static Stack<Integer> tempStack;

   static {
       mainStack = new Stack<>();
       tempStack = new Stack<>();
   }

    public static void main(String[] args) {
        customPush(2);
        customPush(1);
//        customPush(0);
        customPop();
        customPush(6);
        customPush(8);
        customPush(5);
        System.out.println(tempStack.peek()+ " is the smallest element buddy");
    }

    static void customPush(int val){
        mainStack.push(val);
        if(tempStack.isEmpty()){
            tempStack.push(val);
        }

        if(tempStack.peek() > val){
            tempStack.push(val);
        }
    }

    static void customPop(){
       int item = mainStack.pop();
       if(tempStack.pop() == item){
           tempStack.pop();
       }
    }
}
