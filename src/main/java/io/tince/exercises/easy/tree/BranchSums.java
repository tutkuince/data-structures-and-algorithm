package io.tince.exercises.easy.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Branch Sums
 *
 * Write a function that takes in a Binary Tree and returns a list of its branch sums ordered from leftmost branch sum to rightmost branch sum.
 *
 * A branch sum is the sum of all values in a Binary Tree branch.
 * A Binary Tree branch is a path of nodes in a tree that starts at the root node and ends at any leaf node.
 *
 * Each BinaryTree node has an integer value, a left child node, a right child node. Children nodes can be either be BinaryTree nodes themselves or None / null.
 *
 * */
public class BranchSums {

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        // TODO
        return new ArrayList<Integer>();
    }

    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
