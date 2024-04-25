package io.tince._05linkedlist.interview.questions;

/**
 * Binary to Decimal
 *
 * You have a linked list where each node represents a binary digit (0 or 1). The goal of the binaryToDecimal function is to convert this binary number,
 * represented by the linked list, into its decimal equivalent.
 *
 * Function Signature: public int binaryToDecimal()
 *
 * */
public class BinaryToDecimal {
    public static void main(String[] args) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal(1);
        binaryToDecimal.append(1);
        binaryToDecimal.append(0);
        binaryToDecimal.append(0);

        System.out.println(binaryToDecimal.binaryToDecimalSolution2());
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

    public BinaryToDecimal(int value) {
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
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
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

    //   +===================================================+
    //   |               WRITE YOUR CODE HERE                |
    //   | Description:                                      |
    //   | - This method converts a binary number,           |
    //   |   represented as a linked list, to a decimal int. |
    //   |                                                   |
    //   | Return type: int                                  |
    //   | - Returns the decimal equivalent of the binary    |
    //   |   number.                                         |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - We use a while loop to traverse the linked list.|
    //   | - Multiply the current sum by 2 and add the value |
    //   |   at each node to get the decimal number.         |
    //   +===================================================+
    public int binaryToDecimal() {
        Node temp = head;
        int num = 0;
        int counter = length - 1;
        while (temp != null) {
            num += (int) Math.pow(2, counter) * temp.value;
            temp = temp.next;
            counter--;
        }
        return num;
    }

    //   +===================================================+
    //   |               WRITE YOUR CODE HERE  - V2          |
    //   | Description:                                      |
    //   | - This method converts a binary number,           |
    //   |   represented as a linked list, to a decimal int. |
    //   |                                                   |
    //   | Return type: int                                  |
    //   | - Returns the decimal equivalent of the binary    |
    //   |   number.                                         |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - We use a while loop to traverse the linked list.|
    //   | - Multiply the current sum by 2 and add the value |
    //   |   at each node to get the decimal number.         |
    //   +===================================================+
    public int binaryToDecimalSolution2() {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }
}
