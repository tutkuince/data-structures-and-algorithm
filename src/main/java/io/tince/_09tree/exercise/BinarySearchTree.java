package io.tince._09tree.exercise;

import java.util.Objects;

public class BinarySearchTree {

    // CREATE CLASS VARIABLE (ROOT) AND NODE CLASS HERE//
    //                                                 //
    //                                                 //
    //                                                 //
    //                                                 //
    /////////////////////////////////////////////////////
    private Node root;

    class Node {
        Node right;
        Node left;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    // WRITE INSERT METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (Objects.isNull(root)) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (Objects.isNull(temp.left)) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (Objects.isNull(temp.right)) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // WRITE CONTAINS METHOD HERE //
    //                            //
    //                            //
    //                            //
    //                            //
    ////////////////////////////////
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value < value) {
                temp = temp.right;
            } else if (temp.value > value) {
                temp = temp.left;
            } else {
                return true;
            }
        }
        return false;
    }
}
