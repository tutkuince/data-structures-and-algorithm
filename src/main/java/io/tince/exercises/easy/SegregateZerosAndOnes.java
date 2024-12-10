package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Segregate 0s and 1s in an Array
 * <p>
 * You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array.
 */
public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int[] nums2 = {0, 1, 0};
        int[] nums3 = {1, 1};
        int[] nums4 = {0};

        System.out.println("Before segregate method" + Arrays.toString(nums4));
        segregate(nums4);
        System.out.println("After segregate method" + Arrays.toString(nums4));
    }

    private static void segregate(int[] nums) {
        int zeroCount = 0;
        for (int i : nums) {
            if (i == 0) {
                zeroCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < zeroCount) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
    }
}
