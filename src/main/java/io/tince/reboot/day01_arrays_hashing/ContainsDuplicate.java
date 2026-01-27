package io.tince.reboot.day01_arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1, 2, 3, 1] Output: true
 * Example 2:
 * Input: nums = [1, 2, 3, 4] Output: false
 * Example 3:
 * Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Result: " + new ContainsDuplicate().containsDuplicate(nums1));
        System.out.println("Result: " + new ContainsDuplicate().containsDuplicate(nums2));
    }

    // Approach: HashSet Strategy
    // We use a HashSet to store unique elements as we iterate through the array.
    // Since a Set cannot contain duplicate values, checking for existence is efficient.
    // Time Complexity: O(n)
    // - We traverse the array containing n elements only once.
    // - Adding to a HashSet takes O(1) time on average.
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            if (!uniqueNumbers.add(num)) {
                return false;
            }
        }
        return true;
    }

    // Approach: Brute Force
    // We compare evey number with every other number in the array.
    public boolean containsDuplicateWithBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] == nums[y]) {
                    return true;
                }
            }
        }
        return false;
    }
}
