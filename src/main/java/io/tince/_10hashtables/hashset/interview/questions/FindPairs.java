package io.tince._10hashtables.hashset.interview.questions;

import java.util.*;

/**
 * Find Pairs
 *
 * Given two integer arrays "arr1" and "arr2", and an integer "target",
 * write a method named "findPairs" that finds all pairs of integers such that one integer from "arr1", the other is from "arr2",
 * and their sum equals the target value.
 *
 * The method should return a list of integer arrays, each containing a pair of integers.
 *
 * Method Signature: public static List<int[]> findPairs(int[] arr1, int[] arr2, int target)
 *
 * */
public class FindPairs {
    // WRITE FIND PAIRS METHOD HERE //
    //                             //
    //                             //
    //                             //
    //                             //
    /////////////////////////////////
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        return null;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }
}
