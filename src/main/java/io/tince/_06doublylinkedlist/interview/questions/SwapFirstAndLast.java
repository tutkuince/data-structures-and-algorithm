package io.tince._06doublylinkedlist.interview.questions;

/**
 * Swap First and Last
 *
 * Swap First and Last Node Values in a Doubly Linked List.
 *
 * Given a doubly linked list, write a method called swapFirstAndLast() that swaps the values of the first and last nodes in the list.
 *
 * If the length of the list is less than 2 the method should not perform any operation
 *
 * Function Signature: public void swapFirstAndLast()
 *
 * Input:
 * The method is part of the DoublyLinkedList class, which has a "head" and a "tail" pointer, as well as a "length" attribute.
 *
 * Output:
 * The doubly linked list may be empty, have only one node, or have two or more nodes.
 *
 * Note that the pointers to the nodes themselves are not swapped - only their values are exchanged.
 * */
public class SwapFirstAndLast {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public SwapFirstAndLast(int value) {
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
        System.out.println("\nDoubly Linked List:");
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

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    //WRITE SWAP FIRST LAST METHOD HERE//
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public void swapFirstAndLast() {
        if (length < 2)
            return;
        int tempValue = head.value;
        head.value = tail.value;
        tail.value = tempValue;
    }
}
