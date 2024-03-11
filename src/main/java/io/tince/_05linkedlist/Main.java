package io.tince._05linkedlist;

public class Main {
    public static void main(String[] args) {
        /*LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();*/

        // Remove Last
        /*LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());*/

        // Prepend Test
        /*LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();*/

        // Remove First
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Items - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
    }
}
