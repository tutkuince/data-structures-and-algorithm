package io.tince.algorithm.tree.traversal.depth.first.search.pre.order;

import java.util.*;

public class BinarySearchTree {
    private Node root;

    public List<Integer> depthFirstSearchPreOrder() {
        List<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
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

    class Node {
        Node left;
        Node right;
        int value;

        private Node(int value) {
            this.value = value;
        }
    }
}
