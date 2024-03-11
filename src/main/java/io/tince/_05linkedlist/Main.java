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
        /*LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Items - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());*/

        // Get(index)
        /*LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println(myLinkedList.get(2).value + "\n");*/

        // Set(index, value)
        /*LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        System.out.println("Before Set");
        myLinkedList.printList();

        System.out.println("After Set");
        myLinkedList.set(1, 4);
        myLinkedList.printList();*/

        // Insert(index, value)
        /*LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(2);
        System.out.println("Before Insert");
        myLinkedList.printList();
        System.out.println("After Insert");
        myLinkedList.insert(1, 1);
        myLinkedList.printList();*/

        // Remove(index)
        /*LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        System.out.println("Before Remove");
        myLinkedList.printList();
        System.out.println("After Remove");
        myLinkedList.remove(2);
        myLinkedList.printList();*/

        // Reverse()
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        System.out.println("Before Reverse");
        myLinkedList.printList();
        System.out.println("After Reverse");
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
