package io.tince.reboot.day01_arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum:
 * Given an array of integers nums and an integer target, return indices of two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example 1:
 * Input: nums = [2, 7, 11, 15], target = 9 Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 * <p>
 * Example 2:
 * Input: nums = [3, 2, 4], target = 6 Output: [1, 2]
 * Explanation: Because nums[1] + nums[2] == 6, we return [1, 2]
 */
public class TwoSum {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (numberIndexMap.containsKey(diff)) {
                return new int[]{numberIndexMap.get(diff), i};
            }
            numberIndexMap.put(num, i);
        }
        return new int[]{};
    }
}
