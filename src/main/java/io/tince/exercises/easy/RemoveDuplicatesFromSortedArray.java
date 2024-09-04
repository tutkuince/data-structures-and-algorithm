package io.tince.exercises.easy;

import java.util.*;

/**
 * Remove Duplicates from Sorted Array
 * <p>
 * Given an integer array "nums" sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in "nums".
 * <p>
 * Consider the number of unique elements of "nums" to be "k", to get accepted, you need to do the following things:
 * - Change the array "nums" such that the first "k" elements of "nums" contain the unique elements in the order they were present in "nums" initially.
 * - Return "k".
 * <p>
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums3 = new int[]{-3, -1, 0, 0, 0, 3, 3};
        System.out.println(removeDuplicates2(nums3));
    }

    // Brute Force Approach
    public static int removeDuplicates(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int j : nums) {
            if (!numbers.contains(j)) numbers.add(j);
        }
        int index = 0;
        for (Integer number : numbers) {
            nums[index] = number;
            index++;
        }
        return numbers.size();
    }

    public static int removeDuplicates2(int[] nums) {
        int  i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return (i+1);
    }
}
