package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Merge Sorted Array
 * <p>
 * You are given two integer arrays "nums1" and "nums2", sorted in non-decreasing order, and two integers m and n, representing the number of
 * elements in "num1" and "num2" respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last "n" elements are set to "0" and should be ignored. "nums2" has a length of "n".
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * <p>
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * <p>
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] nums11 = new int[]{};
        int[] nums22 = new int[]{1};
        new MergeSortedArray().merge3(nums1, 3, nums2, 3);
    }

    // Brute Force
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (n != nums2Counter && nums1[i] == 0) {
                nums1[i] = nums2[nums2Counter++];
            }
        }
        Arrays.sort(nums1);
    }

    // {1, 2, 3, 0, 0, 0};
    // {2, 5, 6};
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        int nums1Length = m - 1;
        int nums2Length = n - 1;
        while (nums2Length >= 0) {
            if (nums1Length >= 0 && nums1[nums1Length] > nums2[nums2Length]) nums1[length--] = nums1[nums1Length--];
            else nums1[length--] = nums2[nums2Length--];
        }
    }

    // Optimal Solution
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
