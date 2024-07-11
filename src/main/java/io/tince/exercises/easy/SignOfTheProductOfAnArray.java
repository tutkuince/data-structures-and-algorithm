package io.tince.exercises.easy;

/**
 * Sign of the Product of an Array
 *
 * There is a function signFunc(x) that returns:
 *  - "1" if "x" is positive.
 *  - "-1" if "x" is negative.
 *  - "0" if "x" is equal to "0"
 *
 * You are given an integer array "nums". Let "product" be the product of all values in the array "nums".
 * Return "signFunc(product)"
 *
 * Example 1:
 *  Input: nums = [-1,-2,-3,-4,3,2,1]
 *  Output: 1
 *  Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 *
 * Example 2:
 *  Input: nums = [1,5,0,2,-3]
 *  Output: 0
 *  Explanation: The product of all values in the array is 0, and signFunc(0) = 0
 *
 * Example 3:
 *  Input: nums = [-1,1,-1,1,-1]
 *  Output: -1
 *  Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
 *
 * Constraints:
 *  - 1 <= nums.length <= 1000
 *  - -100 <= nums[i] <= 100
 * */
public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{-1, -2, -3, -4, 3, 2, 1};
        int[] nums2 = new int[]{1, 5, 0, 2, -3};
        int[] nums3 = new int[]{-1, 1, -1, 1, -1};
        System.out.println(new SignOfTheProductOfAnArray().arraySign(nums3));
    }

    // Solution - 1
    public int arraySign(int[] nums) {
        int negativeNumberCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) negativeNumberCount++;
        }
        if (negativeNumberCount % 2 == 0) return 1;
        return -1;
    }

    // Solution - 2
    public int arraySign2(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) result = -1;
        }
        return result;
    }
}
