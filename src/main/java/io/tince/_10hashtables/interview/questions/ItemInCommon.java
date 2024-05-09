package io.tince._10hashtables.interview.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Item In Common
 *
 * Write a function "itemInCommon(array1, array2)" that takes two arrays as input an returns "true"
 * if there is at least one common item between the two lists, false otherwise.
 *
 * Use a "HashMap" to solve the problem that creates an O(n) time complexity.
 *
 * */
public class ItemInCommon {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5};
        int[] nums2 = new int[]{2, 4, 5};

        System.out.println(itemInCommon2(nums1, nums2));
    }

    // Inefficient Solution -- O(n^2)
    private static boolean itemInCommon(int[] nums1, int[] nums2) {
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) return true;
            }
        }
        return false;
    }

    // Efficient Solution -- O(n) + O(n) = O(2n) -> Drop the constant = O(n)
    private static boolean itemInCommon2(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : nums1) {
            myHashMap.put(i, true);
        }

        for (int j : nums2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }
}
