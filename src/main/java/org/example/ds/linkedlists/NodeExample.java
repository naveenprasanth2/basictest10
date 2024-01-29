package org.example.ds.linkedlists;

import org.example.linkedList.LinkedListExample;

import java.util.Arrays;

public class NodeExample {
    Node head;
    Node tail;

   public static class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }

    }

    public void addNodeAtTheEnd(int val) {
        Node node = new Node(val);
        if (head == null) head = node;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
    }

    public void addNodeAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node checkForValue(int val) {
        Node current = head;
        while (current != null) {
            if (current.value == val) {
                return current;
            } else {
                current = current.next;
            }
        }
        return new Node(-1);
    }

    public void addNodeAtIndex(int index, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        int count = 1;
        Node current = head;
        while (current != null) {
            if (count == index) {
                Node tempNode = current.next;
                current.next = newNode;
                newNode.next = tempNode;
            }
            current = current.next;
            count++;
        }
    }

    public void deleteNodeAtHead() {
        head = head.next;
    }

    public void deleteNodeAtEnd() {
        Node current = head;
        while (current != null) {
            if (current.next.next == null) {
                current.next = null;
                tail = current;
                break;
            }
            current = current.next;
        }
    }

    public void deleteNodeAtIndex(int index) {
        Node current = head;
        int count = 1;
        while (current.next.next != null) {
            if (count == index) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
            count++;
        }
    }

    public void removeNodeWithEvenValues() {

        while (head != null && head.value % 2 == 0) {
            head = head.next;
        }

        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.value % 2 == 0) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

    }

    public void reverseLinkedList(){
       Node current = head;
       head = tail;
       tail = current;
       Node previous = null;
       while (current != null){
           Node next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }
    }

    public void reverseLinkedListPractise(){
       Node current = head;
       Node previous = null;
       head = tail;
       tail = current;

       while (current != null){
           Node next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }

    }
    public static void main(String[] args) {
        NodeExample nodeExample = new NodeExample();
        nodeExample.addNodeAtTheEnd(6);
        nodeExample.addNodeAtTheEnd(1);
        nodeExample.addNodeAtTheEnd(2);
        nodeExample.addNodeAtTheEnd(2);
//        nodeExample.addNodeAtTheEnd(2);
//        nodeExample.addNodeAtTheEnd(2);
//        nodeExample.addNodeAtTheEnd(3);
//        nodeExample.addNodeAtBeginning(4);
//        nodeExample.addNodeAtBeginning(5);
//        nodeExample.addNodeAtIndex(5, 0);
//        nodeExample.deleteNodeAtHead();
//        nodeExample.deleteNodeAtEnd();
//        nodeExample.deleteNodeAtIndex(3);
//        nodeExample.removeNodeWithEvenValues();
//        nodeExample.reverseLinkedList();
        nodeExample.reverseLinkedListPractise();
        Node current = nodeExample.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }
}
