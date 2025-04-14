package io.tince.exercises.easy.tree;

import java.util.Objects;

/**
 * Find Closest Value in BST
 * <p>
 * Write a function that takes in a Binary Search Tree (BST) and a target integer value and returns the closest value to that target value contained in the BST
 * <p>
 * You can assume that there will only be one closest value.
 * <p>
 * Each BST node has an integer value, a left child node, and a right child node.
 * A node is said to be a valid BST node if and only if it satisfies the BST property: its value is strictly greater that the values of every node to its left;
 * its value is less than or equal to the values of every node to its right; and its children nodes are either valid BTS nodes themselves or Node / null.
 */
public class FindClosestValueInBST {

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.left = new BST(5);
        bst.right = new BST(15);
        bst.left.left = new BST(2);
        bst.left.right = new BST(5);
        bst.right.left = new BST(13);
        bst.right.right = new BST(22);
        bst.right.left.right = new BST(14);

        int result = findClosestValueInBst(bst, 12);
        System.out.println(result);
    }

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int minValue = Integer.MAX_VALUE;
        int closestValue = 0;
        while (!Objects.isNull(tree)) {
            int difference = Math.abs(tree.value - target);

            if (difference < minValue) {
                minValue = difference;
                closestValue = tree.value;
            }

            if (target > tree.value) {
                tree = tree.right;
            } else if (target < tree.value) {
                tree = tree.left;
            } else {
                return tree.value;
            }
        }

        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
