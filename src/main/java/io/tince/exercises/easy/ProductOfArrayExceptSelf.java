package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Product of Array Except Self
 * <p>
 * Given an integer array "nums", return an array "answer" such that "answer[i]" is equal to the product of all the elements of "nums" except "nums[i]".
 * <p>
 * The product of any prefix or suffix of "nums" is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in "O(n)" time and without using the division operation.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(nums2)));
    }

    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        int zeroCount = 0;
        int indexZero = -1;
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                indexZero = i;
            } else {
                result *= nums[i];
            }
        }
        if (zeroCount == 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) resultArray[i] = result;
                else resultArray[i] = result / nums[i];
            }
        } else if (zeroCount == 1) {
            resultArray[indexZero] = result;
        }
        return resultArray;
    }
}
