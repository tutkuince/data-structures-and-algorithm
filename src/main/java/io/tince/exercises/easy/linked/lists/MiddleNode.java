package io.tince.exercises.easy.linked.lists;

import java.util.Objects;

/**
 * Middle Node
 * <p>
 * You are given a Linked List with at least one node. Write a function that returns the middle node of the LinkedList.
 * If there are two middle nodes (i.e. an even length list), your function should return the second of these nodes.
 * <p>
 * Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to Node / null if it's the tail of the list.
 */
public class MiddleNode {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(2);
        linkedList.next = new LinkedList(7);
        linkedList.next.next = new LinkedList(3);
        linkedList.next.next.next = new LinkedList(5);
        middleNode(linkedList);
    }

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList middleNode(LinkedList linkedList) {
        // Write your code here.
        int counter = 1;
        LinkedList current = linkedList;
        while (!Objects.isNull(current.next)) {
            current = current.next;
            counter++;
        }

        int middleIndex = counter / 2;

        current = linkedList;
        while (middleIndex != 0) {
            current = current.next;
            middleIndex--;
        }

        return current;
    }
}
