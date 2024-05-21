package io.tince.algorithm.recursion.binary.search.tree.interview.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert Sorted Array to Balanced Binary Search Tree
 *
 * The task is to develop a method that takes a sorted array of integers as input and constructs a height-balanced BST.
 *
 * This involves creating a BST where the depth of the two subtrees of any node does not differ by more than one.
 *
 * Achieving a height-balanced tree is crucial for optimizing the efficiency of tree operations,
 * ensuring that the BST remains efficient for search, insertion, and deletion across all levels of the tree
 *
 * Method Signature: private Node sortedArrayToBST(int[] nums, int left, int right)
 *
 * Method Overview: sortedArrayToBST
 *  - Input: A sorted array of integers "nums", provided in ascending order.
 *  The input array represents a sequential collection of elements to be transformed into a BST.
 *  The method also receives two additional parameters, "left" and "right", which denotes the current segment of the array being processed.
 *  - Process: The private method sortedArrayToBST employs a divide-and-conquer strategy to construct the BST.
 *  It identifies the middle element of the current array segment to serve as the subtree's root, ensuring that the resulting BST is height-balanced.
 *  The method recursively applies this logic to the left and right halves of the list, building up the BST from the bottom up.
 *  - Output: The root node of a height-balanced BST constructed from the sorted array.
 *  This node links to all other nodes in the BST, effectively representing the entire tree structure.
 *
 * */
public class ConvertSortedArray {

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

    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderHelper(this.root, result);
        return result;
    }

    private void inorderHelper(Node node, List<Integer> result) {
        if (node == null) return;
        inorderHelper(node.left, result);
        result.add(node.value);
        inorderHelper(node.right, result);
    }

    public boolean isBalanced() {
        return height(this.root) != -1;
    }

    private int height(Node node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void sortedArrayToBST(int[] nums) {
        this.root = sortedArrayToBST(nums, 0, nums.length - 1);
    }

    //   +===================================================+
    //   |             WRITE YOUR CODE HERE                  |
    //   | Description:                                      |
    //   | - Converts a sorted array into a height-balanced  |
    //   |   binary search tree (BST).                       |
    //   | - This method is private and used internally      |
    //   |   within the class.                               |
    //   | - It uses recursion to construct the BST.         |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - nums: Sorted array of integers.                 |
    //   | - left: Starting index for the current segment    |
    //   |   of the array.                                   |
    //   | - right: Ending index for the current segment of  |
    //   |   the array.                                      |
    //   |                                                   |
    //   | Return:                                           |
    //   | - The root node of the BST created from the       |
    //   |   sorted array segment.                           |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - The middle element of the current segment is    |
    //   |   chosen as the root to ensure the BST is         |
    //   |   height-balanced.                                |
    //   | - The method recursively builds the left and right|
    //   |   subtrees by calling itself with adjusted left   |
    //   |   and right indices to work on sub-segments of    |
    //   |   the array.                                      |
    //   +===================================================+
    private Node sortedArrayToBST(int[] nums, int left, int right) {

        return null;
    }
}
