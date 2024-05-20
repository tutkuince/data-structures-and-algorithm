package io.tince.algorithm.recursion.binary.search.tree.exercise;

import java.util.Objects;

public class BinarySearchTree {
    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // WRITE THE RECURSIVE CONTAINS METHOD HERE //
    //                                          //
    //                                          //
    //                                          //
    //                                          //
    //////////////////////////////////////////////
    private boolean rContains(Node root, int value) {
        if (Objects.isNull(root)) return false;
        if (value > root.value) {
            return rContains(root.right, value);
        } else if (value < root.value) {
            return rContains(root.left, value);
        } else {
            return true;
        }
    }

    public boolean rContains(int value) { return rContains(root, value); }

    // WRITE THE RECURSIVE INSERT METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////
    private Node rInsert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value > root.value) {
            root.right = rInsert(root.right, value);
        } else if (value < root.value) {
            root.left = rInsert(root.left, value);
        }
        return root;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }
}
