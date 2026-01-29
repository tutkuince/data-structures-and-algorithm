package io.tince.reboot.day02_two_pointer;

import java.util.Arrays;

/**
 * Squares of a Sorted Array
 * <p>
 * Given an integer array "nums" sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * Example 1:
 * Input: nums = [-4, -1, 0, 3, 10] Output: [0, 1, 9, 16, 100]
 * Explanation: After squaring, the array becomes [16, 1, 0, 9, 100]. After sorting, becomes [0, 1, 9, 16, 100].
 * <p>
 * Example 2:
 * Input: nums = [-7, -3, 2, 3, 11] Output: [4, 9, 9, 49, 121]
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    // Approach: Two Pointers
    // Since the array is sorted, the largest squares will be at the ends (extreme left or extreme right).
    // We compare absolute values/squares of both ends and fill the result array from the back.
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int left = 0;
        int right = nums.length - 1;
        int counter = right;
        while (left <= right) {
            int leftValue = nums[left];
            int rightValue = nums[right];
            if (leftValue <= rightValue) {
                result[counter] = rightValue;
                right--;
            } else {
                result[counter] = leftValue;
                left++;
            }
            counter--;
        }
        return result;
    }

    // Time Complexity: O(n) - Single pass through the array.
    // Space Complexity: O(n) - We need an output array to store results.
    public static int[] sortedSquaresV2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int position = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[position] = leftSquare;
                left++;
            } else {
                result[position] = rightSquare;
                right++;
            }
            position--;
        }
        return result;
    }
}
