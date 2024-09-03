package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Remove Element
 * <p>
 * Given an integer array "nums" and an integer "val", remove all occurrences of "val" in "nums" in-place.
 * The order of the elements may be changed. Then return the number of elements in "nums" which are not equal to "val".
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * - Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * - Return k.
 * <p>
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 2, 3};
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new RemoveElement().removeElement2(nums2, 2));
    }

    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int counter = 0;
        int result = 0;
        for (int i = 0; i < nums.length - counter; i++) {
            if (nums[i] == val) {
                counter++;
                int temp = nums[nums.length - counter] == val ? Integer.MAX_VALUE : nums[nums.length - counter];
                nums[nums.length - counter] = Integer.MAX_VALUE;
                nums[i] = temp;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) result++;
        }
        return result;
    }

    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
