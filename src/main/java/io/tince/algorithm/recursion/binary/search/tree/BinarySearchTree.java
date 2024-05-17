package io.tince.algorithm.recursion.binary.search.tree;

import java.util.Objects;

public class BinarySearchTree {
    private Node root;

    class Node {
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }

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

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private boolean rContains(Node currentNode, int value) {
        if (Objects.isNull(currentNode)) return false;
        if (currentNode.value < value)
            return rContains(currentNode.right, value);
        else if (currentNode.value > value)
            return rContains(currentNode.left, value);
        else {
            return true;
        }
    }
}
