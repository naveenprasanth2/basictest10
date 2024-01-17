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
        source.push(1);
        source.push(2);
        source.push(3);
        source.push(4);
        source.push(5);
        source.push(6);
        source.push(0);
        sortTheStack(source);
        System.out.println(sorted);
    }

    static void sortTheStack(Stack<Integer> source) {
        int count;
        while (!source.isEmpty()) {
            count = 1;
            if (sorted.isEmpty()) {
                sorted.push(source.pop());
            } else {
                int valFromSorted = sorted.peek();
                if (valFromSorted > source.peek()) {
                    int valFromSource = source.pop();
                    count++;
                    while (sorted.peek() < valFromSource) {
                        sorted.push(valFromSource);
                    }
                    while (count != 1) {
                        sorted.push(source.pop());
                        count--;
                    }
                } else {
                    int valFromSource = source.pop();
                    sorted.push(valFromSource);
                }
            }
        }
    }
}
