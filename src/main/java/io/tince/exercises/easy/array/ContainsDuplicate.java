package io.tince.exercises.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 * <p>
 * Given an integer array "nums", return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * All elements are distinct.
 * <p>
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i : nums) {
            if (!uniqueNumbers.add(i)) {
                return true;
            }
        }
        return false;
    }
}
