package org.example.linkedList;

public class LinkedListExample {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    public void addNodeAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addNodeAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        Node current = head;
        int count = 1;
        while (current != null) {
            if ((count) == index) {
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                break;
            }
            current = current.next;
            count++;
        }
    }

    void deleteNodesAtLastIndex() {
        Node current = head;
        while (current != null) {
            if (current.next.next == null) {
                current.next = null;
                break;
            }
            current = current.next;
        }
    }

    void deleteNodeAtStart() {
        Node current = head;
        head = current.next;
    }

    void deleteNodeAtSpecifiedIndex(int index) {
        Node current = head;
        int count = 1;
        while (current != null) {
            if (count == index) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
            count++;
        }
    }

    void removeNodesOfEvenValues() {
        Node current = head;
        while (current != null) {
            if (current.next != null) {
                if (current.next.val % 2 == 0) {
                    if (current.next.next != null) {
                        current.next = current.next.next;
                    } else {
                        current.next = null;
                    }
                }
            }
            current = current.next;
        }
        current = head;
        if (current.val % 2 == 0) {
            if(current.next != null){
                head = current.next;
            }else {
                head = null;
            }
        }
    }

    void reverseLinkedList() {
        Node headNode = head;
        Node tailNode = tail;
    }

    public static void main(String[] args) {

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.addNodeAtEnd(10);
//        linkedListExample.addNodeAtEnd(20);
//        linkedListExample.addNodeAtEnd(30);
//        linkedListExample.addNodeAtEnd(40);
//        linkedListExample.addNodeAtEnd(50);
        linkedListExample.addNodeAtEnd(6);
//        linkedListExample.addNodeAtEnd(7);
        linkedListExample.addNodeAtBeginning(5);
//        linkedListExample.addNodeAtIndex(2, 0);
        linkedListExample.deleteNodesAtLastIndex();
//        linkedListExample.deleteNodeAtStart();
//        linkedListExample.deleteNodeAtSpecifiedIndex(1);
//        linkedListExample.deleteNodeAtSpecifiedIndex(4);
        linkedListExample.removeNodesOfEvenValues();
        Node current = linkedListExample.head;
        boolean isValPresent = false;
//        while (current != null) {
//            if (current.val == 6) {
//                isValPresent = true;
//                break;
//            }
//            current = current.next;
//        }
//        System.out.println("The value 6 present inside the node is : " + isValPresent);

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
