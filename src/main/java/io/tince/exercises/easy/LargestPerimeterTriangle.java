package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Largest Perimeter Triangle
 * <p>
 * Given an integer array "nums", return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths.
 * If it is impossible to form any triangle of a non-zero area, return "0".
 * <p>
 * Example 1:
 * Input: nums = [2,1,2]
 * Output: 5
 * Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
 * <p>
 * Example 2:
 * Input: nums = [1,2,1,10]
 * Output: 0
 * Explanation:
 * You cannot use the side lengths 1, 1, and 2 to form a triangle.
 * You cannot use the side lengths 1, 1, and 10 to form a triangle.
 * You cannot use the side lengths 1, 2, and 10 to form a triangle.
 * As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.
 * <p>
 * The necessary and sufficient condition for these lengths to form a triangle of non-zero area is a+b>c.
 */
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 1, 2};
        int[] nums2 = new int[]{1, 2, 1, 10};
        System.out.println(new LargestPerimeterTriangle().largestPerimeter(nums1));
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }
}
