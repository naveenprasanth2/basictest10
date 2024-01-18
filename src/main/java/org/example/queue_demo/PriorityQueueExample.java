package org.example.queue_demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    static Queue<Integer> queue;

    static {
        queue = new PriorityQueue<>();
    }

    public static void main(String[] args) {
        queue.add(15);
        queue.add(10);
        queue.add(2);
        queue.add(100);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
