package io.tince.exercises.easy.linked.lists;

import java.util.Objects;

/**
 * Remove Duplicates From Linked List
 *
 * You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
 * Write a function that returns a modified version of the Linked List that doesn't contain any nodes with duplicate values.
 * The Linked List should be modified in place (i.e., you shouldn't create a brand new list),
 * and the modified Linked List should still have its nodes sorted with respect to their values.
 *
 * Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to None/null if it's the tail of the list.
 * */
public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.next = new LinkedList(1);
        linkedList.next.next = new LinkedList(3);
        linkedList.next.next.next = new LinkedList(4);
        linkedList.next.next.next.next = new LinkedList(4);
        linkedList.next.next.next.next.next = new LinkedList(4);
        linkedList.next.next.next.next.next.next = new LinkedList(5);
        linkedList.next.next.next.next.next.next.next = new LinkedList(6);
        linkedList.next.next.next.next.next.next.next.next = new LinkedList(6);

        removeDuplicatesFromLinkedList(linkedList);
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

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList current = linkedList;
        while (!Objects.isNull(current.next)) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return linkedList;
    }
}
