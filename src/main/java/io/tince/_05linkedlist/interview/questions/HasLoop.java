package io.tince._05linkedlist.interview.questions;

/**
 * Has Loop
 * Write a method called hasLoop that is part of the linked list class.
 * The method should be able to detect if there is a cycle or loop present in the linked list.
 * You are required to use Floyd's cycle-finding algorithm to detect the loop.
 *
 * This algorithm uses two pointers: a slow pointer and a fast pointer. The slow pointer moves one step at a time,
 * while the fast pointer moves two steps at a time. Of there is a loop in the linked list, the two pointers will eventually meet at some point.
 * If there is no loop, the fast pointer will reach the end of the list.
 *
 * Output:
 * Return "true" if the linked list has a loop.
 * Return "false" if the linked list does not have a loop.
 *
 * Constraints:
 * You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
 * You can only traverse the linked list once.
 *
 * Method Signature:
 * public boolean hasLoop()
 * */
public class HasLoop {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public HasLoop(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE HASLOOP METHOD HERE //
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
