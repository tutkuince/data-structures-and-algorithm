package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Find the largest four and find the sum
 * */
public class LargestFour {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, -2, 3, 1, 2, 6, 6};
        System.out.println(largestFour(nums));
    }

    private static int largestFour(int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > arr.length - 5; i--) {
            result += arr[i];
        }
        return result;
    }
}
