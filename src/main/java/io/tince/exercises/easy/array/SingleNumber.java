package io.tince.exercises.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Single Number
 * <p>
 * Given a "non-empty" array of integers "nums", every element appears twice except for one. Fİnd that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber2(nums);
    }

    // Brute Force Approach
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        for (int i : nums) {
            numberCountMap.put(i, numberCountMap.getOrDefault(i, 0) + 1);
        }
        for (Integer i : numberCountMap.keySet()) {
            if (numberCountMap.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;

    }
}
