package io.tince._05linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
        } else {
            tail.next = newNode;
        }
        this.tail = newNode;
        this.length++;
    }

    public void makeEmpty() {
        this.tail = null;
        this.head = null;
        this.length = 0;
    }

    public void getHead() {
        String result = "Head: ";
        printResult(this.head, result);
    }

    public void getTail() {
        String result = "Tail: ";
        printResult(this.tail, result);
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    private void printResult(Node tail, String result) {
        if (tail == null) {
            System.out.println(result + "null");
        } else {
            System.out.println(result + tail.value);
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
