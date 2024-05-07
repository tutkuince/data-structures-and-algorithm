package io.tince._09tree.exercise;

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
}
