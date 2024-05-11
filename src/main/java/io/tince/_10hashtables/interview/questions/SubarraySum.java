package io.tince._10hashtables.interview.questions;

/**
 * Subarray Sum
 *
 * Give an array of integers "nums" and a target integer "target", write a method called "subarraySum"
 * that finds the indices of a contiguous subarray in "nums" that add up to the "target" sum using a hash table (HashMap)
 *
 * Your function should take two arguments:
 *  - "nums": an array of integers representing the input array
 *  - "target": an integer representing the target sum
 *
 * Your function should return a list of two integers representing the starting and ending indices of the subarray that adds up to the target sum.
 * If there is no such subarray, your function should return an empty list.
 *
 * */
public class SubarraySum {

    // WRITE SUBARAYSUM METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public static int[] subarraySum(int[] nums, int target) {
        // TODO:
        return null;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]");

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

        */

    }
}
