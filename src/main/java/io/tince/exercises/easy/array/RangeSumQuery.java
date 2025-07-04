package io.tince.exercises.easy.array;

/**
 * Range Sum Query - Immutable
 * Given an integer array "nums", handle multiple queries of the following type:
 * 1. Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * - NumArray(int[] nums) Initializes the object with the integer array nums.
 * - int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive
 * <p>
 * Example 1:
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 * <p>
 * Explanation
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
 * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
 * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 */
public class RangeSumQuery {
    private int[] prefixSum;

    public static void main(String[] args) {
        int[] input = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(input);
    }

    public RangeSumQuery(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
