package io.tince.exercises.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Missing Number
 *
 * Given an array "nums" containing "n" distinct numbers in the range "[0, n]", return the only number in the range that is missing from the array.
 *
 * Example 1:
 *  Input: nums = [3, 0, 1]
 *  Output: 2
 *  Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3]. 2 is the missing number in the range since it does not appear in nums.
 *
 * Example 2
 *  Input: nums = [0, 1]
 *  Output: 2
 *  Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 2]. 2 is the missing number in the range since it does not appear in nums.
 *
 * Example 3:
 *  Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
 *  Output: 8
 *  Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 10^4
 *  - 0 <= nums[i] <= n
 *  - All the numbers of "nums" are unique
 * */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, 1};
        System.out.println(new MissingNumber().missingNumberMapOperation(nums));
    }

    // Sorting Approach
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index++;
            if (nums[i] != i) return i;
        }
        return index;
    }

    // Sum of all elements
    // Sum of n numbers = n(n + 1) / 2
    public int missingNumberSumOfAllElementsApproach(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return sum - actualSum;
    }

    // XOR operation
    // If we XOR something with 0, it will return the same number   -> 5 ^ 0 = 5
    // If we XOR 2 same numbers the output will be 0.               -> 5 ^ 5 = 0
    // XORing 2 different numbers will result nothing               -> 4 ^ 5 = 4 ^ 5
    public int missingNumberXOROperation(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans ^= i;
        }
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

    // Map Approach
    public int missingNumberMapOperation(int[] nums) {
        int n = nums.length;
        Map<Integer, Boolean> presentedNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            presentedNumbers.put(nums[i], true);
        }
        for (int i = 0; i < n; i++) {
            if (!presentedNumbers.containsKey(i)) return i;
        }
        return -1;
    }
}
