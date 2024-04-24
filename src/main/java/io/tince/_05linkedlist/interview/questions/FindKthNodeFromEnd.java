package io.tince._05linkedlist.interview.questions;

/**
 * Find Kth Node From End
 * <p>
 * Implement a method called "findKthFromEnd" that returns the k-th node from the end of the list
 * <p>
 * If the list has fewer than k nodes, the method should return "null".
 * <p>
 * Note: This implementation of the LinkedList class does not have the "length" attribute.
 * <p>
 * Method Signature: public Node findKthFromEnd(int k)
 */
public class FindKthNodeFromEnd {
    private Node head;
    private Node tail;

    public static void main(String[] args) {
        FindKthNodeFromEnd myList = new FindKthNodeFromEnd(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        Node result = myList.findKthFromEndSolutionOne(2); // Output: Node with value 4
        System.out.println(result.value);
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public FindKthNodeFromEnd(int value) {
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

    // WRITE FINDKTHFROMEND METHOD HERE //
    //                                  //
    //    SOLUTION 1                    //
    //                                  //
    //                                  //
    //////////////////////////////////////
    public Node findKthFromEndSolutionOne(int k) {
        int counter = 1;
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
            counter++;
        }
        if (k > counter) return null;
        int index = counter - k;
        temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // WRITE FINDKTHFROMEND METHOD HERE //
    //                                  //
    //    SOLUTION 2                    //
    //                                  //
    //                                  //
    //////////////////////////////////////
    public Node findKthFromEndSolutionTwo(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
