package io.tince._07stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        top = new Node(value);
        height = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
