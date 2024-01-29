package org.example.ds.stacks;

import java.util.Stack;

public class StackExample {
    static Stack<String> originalStack;

    static {
        originalStack = new Stack<>();
    }

    public static void main(String[] args) {


        originalStack.push("naveen");
        originalStack.push("prasanth");
//        System.out.println(reverseStack(originalStack));
        insertItemOnGivenIndex(0, "summa");

        System.out.println(originalStack);
    }

    public static void insertItemOnGivenIndex(int index, String value) {
        Stack<String> tempStack = new Stack<>();
        int count = index;
        if (originalStack.size() <= index) {
            while (count >= 0) {
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
