package io.tince._05linkedlist.exercise;

/**
 * Find the Middle Node
 * Implement a method called findMiddleNode that returns  the middle node of the linked list.
 * If the list has an even number of nodes, the method should return the second middle node.
 * Note: this LinkedList implementation does not have a length member variable.
 * Method Signature: public Node findMiddleNode()
 *
 * */

public class FindMiddleNode {

    public static void main(String[] args) {
        FindMiddleNode myList = new FindMiddleNode(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        Node middleNode = myList.findMiddleNodeSolutionOne();
        System.out.println(middleNode.value); // Output: 3
        myList.append(6);
        middleNode = myList.findMiddleNodeSolutionOne();
        System.out.println(middleNode.value); // Output: 4
    }

    private Node head;
    private Node tail;

    public FindMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    // WRITE FIND MIDDLE NODE METHOD HERE //
    //                                    //
    //     SOLUTION 1                     //
    //                                    //
    //                                    //
    ////////////////////////////////////////
    public Node findMiddleNodeSolutionOne() {
        if (head == null || tail == null) {
            return null;
        }
        int counter = 0;
        Node temp = head;
        while (temp.next != null) {
            counter++;
            temp = temp.next;
        }
        int result = counter % 2 == 0 ? counter / 2 : counter / 2 + 1;
        temp = head;
        for (int i = 0; i < result; i++) {
            temp = temp.next;
        }
        return temp;
    }

    

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
