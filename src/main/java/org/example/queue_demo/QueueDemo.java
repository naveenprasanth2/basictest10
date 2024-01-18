package org.example.queue_demo;

import java.util.Arrays;

public class QueueDemo {
    int rear;
    int front;
    int[] a;
    int size;

    public QueueDemo(int size) {
        rear = -1;
        this.size = size;
        a = new int[this.size];
    }

    public void enQueue(int element) {
        ++rear;
        a[rear] = element;
    }

    public int deQueue() {
        int element = a[0];
        for (int i = 0; i <= rear; i++) {
            a[i] = a[i + 1];
        }
        rear--;
        return element;
    }

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo(10);
        queueDemo.enQueue(5);
        queueDemo.enQueue(7);
        System.out.println(Arrays.toString(queueDemo.a));
        System.out.println(queueDemo.deQueue());
        System.out.println(Arrays.toString(queueDemo.a));
    }

}
