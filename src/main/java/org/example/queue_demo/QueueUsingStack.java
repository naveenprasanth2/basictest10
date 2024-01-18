package org.example.queue_demo;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> stack;

    static {
        stack = new Stack<>();
    }

    static void enQueue(int element) {
        stack.push(element);
    }

    static int deQueue() {
        int size = stack.size();
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 1; i < size; i++) {
            tempStack.push(stack.pop());
        }
        // or simply use another stack and put all those there and then do one pop
        // this is very simpler than the logic implemented over here
        int deQueuedVal = stack.pop();
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        return deQueuedVal;
    }

    public static void main(String[] args) {
        enQueue(15);
        enQueue(20);
        enQueue(55);
        enQueue(0);

        System.out.println(stack);
        System.out.println("dequeued val is "+ deQueue());
        System.out.println(stack);
    }
}
