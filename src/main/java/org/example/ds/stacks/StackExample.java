package org.example.ds.stacks;

import java.util.Stack;

public class StackExample {
    static Stack<String> originalStack;
    static Stack<Integer> numberStack;

    static {
        originalStack = new Stack<>();
        numberStack = new Stack<>();
    }

    public static void main(String[] args) {


        originalStack.push("naveen");
        originalStack.push("prasanth");
//        System.out.println(reverseStack(originalStack));
        insertItemOnGivenIndex(0, "summa");

//        originalStack.reversed().forEach(System.out::println);
        findMinimumElementInAStack();
    }

    public static void insertItemOnGivenIndex(int index, String value) {
        Stack<String> tempStack = new Stack<>();
        int count = index;
        if (originalStack.size() >= index) {
            while (count > 0) {
                tempStack.push(originalStack.pop());
                count--;
            }
            originalStack.push(value);
            while (!tempStack.isEmpty()) {
                originalStack.push(tempStack.pop());
            }

        } else {
            originalStack.push(value);
        }
    }

    public static void findMinimumElementInAStack(){
        numberStack.add(1);
        numberStack.add(2);
        numberStack.add(0);
        numberStack.add(10);
        numberStack.add(-10);
        Stack<Integer> tempStack = new Stack<>();
        while (!numberStack.isEmpty()){
            if(tempStack.isEmpty()){
                tempStack.push(numberStack.pop());
            }else {
                int tempStackVal = tempStack.peek();
                int numberStackVal = numberStack.peek();
                if(tempStackVal > numberStackVal){
                    tempStack.push(numberStack.pop());
                }
                numberStack.pop();
            }
        }

        System.out.println(tempStack.pop());
    }

    public static void sortTheList(){
        numberStack.add(1);
        numberStack.add(2);
        numberStack.add(0);
        numberStack.add(10);
        numberStack.add(-10);

        Stack<Integer> tempStack = new Stack<>();
        while (!numberStack.isEmpty()){
            if(tempStack.isEmpty()){
                tempStack.push(numberStack.pop());
            }else {
                while (!numberStack.isEmpty()){
                    if(numberStack.peek() > tempStack.peek()){
                        tempStack.push(numberStack.pop());
                    }
                }

            }
        }





    }

    public static Stack<String> reverseStack(Stack<String> stack) {
        Stack<String> tempStack1 = new Stack<>();
        Stack<String> tempStack2 = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack1.push(stack.pop());
        }

        while (!tempStack1.isEmpty()) {
            tempStack2.push(tempStack1.pop());
        }

        while (!tempStack2.isEmpty()) {
            stack.push(tempStack2.pop());
        }
        return stack;
    }
}
