package org.example.queue_demo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class InBuiltQueue {

    static Queue<Integer> queue;

    static {
        queue = new ArrayDeque<>();
    }

    public static void main(String[] args) {
        queue.add(15);
        queue.add(10);
        queue.add(2);
        System.out.println(queue);
        reverseTheQueue(queue);
        System.out.println(queue);
    }

    static void reverseTheQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
