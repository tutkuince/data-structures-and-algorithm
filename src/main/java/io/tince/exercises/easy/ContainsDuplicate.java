package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 *
 * Given an integer array "nums", return true if any value appears at least twice in the array, and return "false" if every element is distinct.
 *
 * Example 1:
 *  Input: nums = [1, 2, 3, 1]
 *  Output: true
 *
 * Example 2:
 *  Input: nums = [1, 2, 3, 4]
 *  Output: false
 *
 * Example 3:
 *  Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 *  Output: true
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -10^9 <= nums[i] <= 10^9
 * */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(new ContainsDuplicate().containsDuplicateBySorting(nums));
    }

    // other solution
    public boolean containsDuplicateBySorting(int[] nums) {
        Arrays.sort(nums); // O(nlog(n))
        for (int i = 1; i < nums.length; i++) { // O(n)
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    // Optimal Solution
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numberSet.add(nums[i])) return true;
        }
        return false;
    }
}
