package org.example.stack;

import java.util.Stack;

public class StackExample {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;
    static Stack<Integer> stack3;
    static Stack<Integer> tempList;

    static {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack3 = new Stack<>();
        tempList = new Stack<>();
    }

    public static void main(String[] args) {

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(0);
        System.out.println(stack1);
        moveStack(stack1, stack2);
        moveStack(stack2, stack3);
        moveStack(stack3, stack1);
        System.out.println(stack1);
        insertAtGivenIndex(stack1, 2, 55);
        insertAtGivenIndex(stack1, 0, 56);
        System.out.println(findMinimumValueInStack(stack1));
    }

    static void moveStack(Stack<Integer> source, Stack<Integer> destination) {
        while (!source.isEmpty()) {
            destination.push(source.pop());
        }
    }

    static void insertAtGivenIndex(Stack<Integer> source, int index, int value) {
        Stack<Integer> tempStack = new Stack<>();
        int lastToFirstIndex = source.size() - index;
        for (int i = 0; i < lastToFirstIndex; i++) {
            tempStack.push(source.pop());
        }
        source.push(value);
        while (!tempStack.isEmpty()) {
            source.push(tempStack.pop());
        }
        System.out.println(source);
    }

    static int findMinimumValueInStack(Stack<Integer> source) {
        int min = source.pop();
        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(min);
        while (!source.isEmpty()) {
            int val = source.pop();
            min = Math.min(val, min);
            tempStack.push(val);
        }
        while (!tempStack.isEmpty()) {
            source.push(tempStack.pop());
        }
        return min;
    }
}
