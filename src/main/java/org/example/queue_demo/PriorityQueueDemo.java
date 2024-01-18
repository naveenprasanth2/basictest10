package org.example.queue_demo;

public class PriorityQueueDemo {

    int rear;
    int front;
    int[] a;
    int size;

    public PriorityQueueDemo(int size) {
        rear = -1;
        this.size = size;
        a = new int[this.size];
    }

    void enQueue(int value) {
        if (a.length == 0){
            a[0] = value;
        }else {
//            while ()
        }

    }


    public static void main(String[] args) {
        PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo(5);
        priorityQueueDemo.enQueue(5);
    }
}