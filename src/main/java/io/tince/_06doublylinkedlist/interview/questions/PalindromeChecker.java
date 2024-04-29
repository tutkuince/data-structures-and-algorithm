package io.tince._06doublylinkedlist.interview.questions;

/**
 * Palindrome Checker
 * Write a method to determine whether a given doubly linked list reads the same forwards and backwards.
 *
 * For example, if the list contains the values [1, 2, 3, 2, 1] then the method should return "true", since the list is a palindrome.
 *
 * If the list contains the values [1, 2, 3, 4, 5], then the method should return "false", since the list is not a palindrome.
 *
 * Method name: isPalindrome
 * Return type: boolean
 * */
public class PalindromeChecker {
    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {
        PalindromeChecker myDLL1 = new PalindromeChecker(1);
        myDLL1.append(2);
        myDLL1.append(3);
        myDLL1.append(2);
        myDLL1.append(1);

        System.out.println("myDLL1 isPalindrome:");
        System.out.println( myDLL1.isPalindrome() );



        PalindromeChecker myDLL2 = new PalindromeChecker(1);
        myDLL2.append(2);
        myDLL2.append(3);

        System.out.println("\nmyDLL2 isPalindrome:");
        System.out.println( myDLL2.isPalindrome() );
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public PalindromeChecker(int value) {
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

    // WRITE ISPALINDROME METHOD HERE //
    //                                //
    //                                //
    //                                //
    //                                //
    ////////////////////////////////////
    public boolean isPalindrome() {
        Node tempHead = head;
        Node tempTail = tail;
        boolean result = true;
        for (int i = 0; i < length / 2; i++) {
            if (tempHead.value != tempTail.value) {
                return false;
            }
            tempHead = tempHead.next;
            tempTail = tempTail.prev;
        }
        return result;
    }
}
