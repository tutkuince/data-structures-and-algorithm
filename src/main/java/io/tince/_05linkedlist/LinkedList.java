package io.tince._05linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

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

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.tail = newNode;
        } else {
            newNode.next = head;
        }
        this.head = newNode;
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
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

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
