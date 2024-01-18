package org.example.stack;

import java.util.Stack;

public class SortTheStack {
    static Stack<Integer> source;
    static Stack<Integer> sorted;

    static {
        source = new Stack<>();
        sorted = new Stack<>();
    }

    public static void main(String[] args) {
        source.push(55);
        source.push(2);
        source.push(3);
        source.push(4);
        source.push(5);
        source.push(6);
        source.push(0);
        source.push(-2);
        System.out.println(source);
        sortTheStack(source);
        System.out.println(sorted);
    }

    static void sortTheStack(Stack<Integer> source) {
        while (!source.isEmpty()) {
            if (sorted.isEmpty()) {
                sorted.push(source.pop());
            } else {
                int valueFromSource = source.pop();
                while (sorted.peek() > valueFromSource){
                    source.push(sorted.pop());
                }
                if(sorted.peek() < valueFromSource){
                    sorted.push(valueFromSource);
                }
            }
        }
    }
}
