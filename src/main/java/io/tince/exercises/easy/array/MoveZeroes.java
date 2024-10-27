package io.tince.exercises.easy.array;

import java.util.Arrays;

/**
 * Move Zeroes
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (number != 0) {
                nums[nonZeroCount] = number;
                nonZeroCount++;
            }
        }
        int zeroCount = nums.length - nonZeroCount;
        for (int i = 0; i < zeroCount; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }
}
