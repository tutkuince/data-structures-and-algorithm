package io.tince._09tree;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    class Node {
        Node left;
        Node right;
        int value;

        private Node(int value) {
            this.value = value;
        }
    }
}
