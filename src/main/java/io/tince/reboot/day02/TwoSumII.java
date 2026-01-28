package io.tince.reboot.day02;

import java.util.Arrays;

/**
 * Two Sum II - Input Array is Sorted
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * - You must use only constant extra space O(1)
 * - The array is sorted
 * <p>
 * Example 1:
 * Input: numbers = [2, 7, 11, 15], target = 9, Output: [1, 2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2]
 * <p>
 * Example 2:
 * Input: numbers = [2, 3, 4], target = 6, Output: [1, 3]
 * Explanation: The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3. We return [1, 3]
 */
public class TwoSumII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
    }

    // Approach: Two Pointers
    // Since the array is sorted, we can use two pointers to find the target sum
    // This eliminates the need for a HashMap (saving space)
    // Time Complexity: O(n)    - We traverse the array at most once.
    // Space Complexity: O(1)   - We only use two variables for pointers.
    public static int[] twoSum(int[] sortedNums, int target) {
        int left = 0;
        int right = sortedNums.length - 1;
        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }
}
