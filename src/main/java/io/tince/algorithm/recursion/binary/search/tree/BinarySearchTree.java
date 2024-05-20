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

    public Node getRoot() {
        return root;
    }

    public void rInsert(int value) {
        if (Objects.isNull(root)) root = new Node(value);
        rInsert(root, value);
    }



    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode;
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }



    private Node rInsert(Node currentNode, int value) {
        if (Objects.isNull(currentNode)) return new Node(value);
        if (currentNode.value > value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (currentNode.value < value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
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
