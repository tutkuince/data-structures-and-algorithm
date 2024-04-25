package io.tince._05linkedlist.interview.questions;

/**
 * Reverse Between
 *
 * In the LinkedList class, implement a method called reverseBetween that reverses the nodes of the list between indexes "startIndex" and "endIndex" (inclusive)
 *
 * It is important to note that you should only rearrange the nodes themselves, not just their values.
 *
 * Note: The LinkedList does not have a tail which will make the implementation easier.
 *
 * Assumption: You can assume that "startIndex" and "endIndex" are not out of bounds.
 *
 * The method signature: public void reverseBetween(int m, int n)
 *
 * The method should not return any value, and it should modify the original linked list.
 *
 * Notes:
 * - The method should not duplicate any of the existing nodes, only rearranging the existing nodes in the list
 * - However, the creation of a limited number of new nodes is allowed
 * - The method should not use any extra data structures such as arrays or list.
 * */
public class ReverseBetween {

    public static void main(String[] args) {
        ReverseBetween between = new ReverseBetween(1);
        between.append(2);
        between.append(3);
        between.append(4);
        between.append(5);
        between.reverseBetween(1, 3);
        between.printAll();
    }

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public ReverseBetween(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
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
        } else {
            System.out.println("Head: " + head.value);
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
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE REVERSE BETWEEN METHOD HERE//
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
    public void reverseBetween(int m, int n) {
        if (m < 0 || n > length) {
            return;
        }
        Node start = get(m);
        Node before = head;
        Node end = get(n);
        Node temp = start;
        for (int i = m; i < n; i++) {

            if (i != 0) {
                before = get(i - 1);
            }
            start = end;
            end = temp;
            before.next = start;

        }
    }

    private Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
