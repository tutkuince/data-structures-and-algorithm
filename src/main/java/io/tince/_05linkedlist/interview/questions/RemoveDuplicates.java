package io.tince._05linkedlist.interview.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Duplicates
 * You are given a singly linked list that contains integer values, where some of these values may be duplicated.
 * <p>
 * Note: this linked list class does not have a "tail" which will make this method easier to implement
 * <p>
 * Your task is to implement a method called removeDuplicates() within the LinkedList class that removes all duplicate values from the list
 * <p>
 * Your method should not create a new list, but rather modify the existing list in-place, preserving the relative order of the nodes.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates(1);
        removeDuplicates.append(2);
        removeDuplicates.append(3);
        removeDuplicates.append(1);
        removeDuplicates.append(4);
        removeDuplicates.append(2);
        removeDuplicates.append(5);
        removeDuplicates.removeDuplicates();
        removeDuplicates.printAll();
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

    public RemoveDuplicates(int value) {
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
        if (head == null) {
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

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////
    public void removeDuplicates() {
        Set<Integer> integerSet = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (!integerSet.contains(current.value)) {
                integerSet.add(current.value);
                previous = current;
            } else {
                previous.next = current.next;
                length--;
            }
            current = current.next;
        }
    }
}
