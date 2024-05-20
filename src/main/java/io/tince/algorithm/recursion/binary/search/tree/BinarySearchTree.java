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

    public void rDeleteNode(int value) {
        deleteNode(root, value);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    public Node deleteNode(Node currentNode, int value) {
        if (Objects.isNull(currentNode)) return null;
        if (currentNode.value > value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (currentNode.value < value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (Objects.isNull(currentNode.left) && Objects.isNull(currentNode.right)) {
                return null;
            } else if (Objects.isNull(currentNode.left)) {
                currentNode = currentNode.right;
            } else if (Objects.isNull(currentNode.right)) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
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
