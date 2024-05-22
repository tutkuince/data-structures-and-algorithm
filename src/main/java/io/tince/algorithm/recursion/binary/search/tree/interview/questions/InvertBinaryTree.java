package io.tince.algorithm.recursion.binary.search.tree.interview.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Invert Binary Tree
 *
 * Objective: Write a method to invert (or mirror) a binary tree.
 * This means that for every node in the binary tree, you will swap its left and right children.
 *
 * Method Signature: private Node invertTree(Node node)
 *
 * Input:
 * - node: A Node object representing the root of a binary tree.
 * The Node class has attributes value, left, and right, where value is the value stored in the node,
 * and left and right are pointers to the node's left and right children, respectively.
 *
 * Output:
 * - The root node of the inverted binary tree.
 *
 * Requirements:
 * - The method must be recursive. It should work by traversing the tree and swapping the left and right children of every node encountered.
 * - If the input tree is empty (i.e., node is null), the method should return null.
 * - The inversion should happen in-place, meaning you should not create a new tree but instead modify the existing tree structure.
 * - The method should handle binary trees of any size and structure, ensuring that every node's left and right children are swapped.
 * */
public class InvertBinaryTree {
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

    private Node insert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
        }
        return currentNode;
    }
    public void insert(int value) {
        if (root == null) root = new Node(value);
        insert(root, value);
    }

    public List<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        if (currentNode != null) {
            queue.add(currentNode);
        }

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            if (currentNode != null) {
                results.add(currentNode.value);
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public void invert() {
        root = invertTree(root);
    }

    private Node invertTree(Node root) {
        return null;
    }

    //   +===================================================+
    //   |              WRITE YOUR CODE HERE                 |
    //   | Description:                                      |
    //   | - Inverts a binary tree by swapping the left and  |
    //   |   right children of all nodes in the tree.        |
    //   | - This method is private and intended for internal|
    //   |   use within the class.                           |
    //   | - It operates recursively, visiting each node and |
    //   |   swapping its children.                          |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - node: The current node to process.              |
    //   |                                                   |
    //   | Return:                                           |
    //   | - The node after its subtree has been inverted.   |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - The base case for the recursion is when the     |
    //   |   method encounters a null node.                  |
    //   | - A temporary node is used to facilitate the swap |
    //   |   of the left and right children.                 |
    //   +===================================================+
}
