package io.tince.algorithm.tree.traversal.breadth.first.search;

import java.util.*;

public class BinarySearchTree {
    private Node root;

    public List<Integer> breadthFirstSearch() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null)
                queue.add(currentNode.left);
            if (currentNode.right != null)
                queue.add(currentNode.right);
        }
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
