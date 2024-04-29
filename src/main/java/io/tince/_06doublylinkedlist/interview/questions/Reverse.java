package io.tince._06doublylinkedlist.interview.questions;

/**
 * Reverse
 * Implement a method called reverse() that reverses the order of the nodes in the list.
 *
 * This method shoud reverse the order of the nodes in the list by manipulating the pointers of each node, not by swapping the values within the nodes.
 *
 * Method Signature: public void reverse()
 *
 * Output: Not explicit output is returned. However, the method should modify the doubly linked list such that the order of the nodes is reversed.
 *
 * Constraints: The doubly linked list may be empty or have one or more nodes.
 *
 * */
public class Reverse {
    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {
        Reverse myDLL = new Reverse(1);
        myDLL.append(2);
        myDLL.append(3);

        System.out.println("DLL before reverse:");
        myDLL.printList();

        myDLL.reverse();

        System.out.println("\nDLL after reverse:");
        myDLL.printAll();
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public Reverse(int value) {
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

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    // WRITE REVERSE METHOD HERE //
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public void reverse() {
        // 1 <-> 2 <-> 3 <-> 4 <-> 5
        // 5 <-> 2 <-> 3 <-> 4 <-> 1
        //
        // TODO
    }
}
