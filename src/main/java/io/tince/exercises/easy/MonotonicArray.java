package io.tince.exercises.easy;

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * <p>
 * An array "nums" is monotone increasing if for all "i <= j", nums[i] <= nums[j]. An array "nums" is monotone decreasing if for all "i <= j", "nums[i] >= nums[j]
 * <p>
 * Given an integer array "nums", return "true" if the given array is monotonic, or "false" otherwise.
 * <p>
 * Example 1:
 * Input: nums = [1, 2, 2, 3]
 * Output: true
 * <p>
 * Example 2:
 * Input nums = [6, 5, 4, 4]
 * Output: true
 * <p>
 * Example 3:
 * Input nums = [1, 3, 2]
 * Output: false
 */
public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 3};
        int[] nums2 = new int[]{6, 5, 4, 4};
        int[] nums3 = new int[]{1, 3, 2};
        int[] nums4 = new int[]{1, 1, 0};
        int[] nums5 = new int[]{11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5};
        System.out.println(new MonotonicArray().isMonotonic(nums5));
    }

    public boolean isMonotonic(int[] nums) {
        // TODO: test casses not fully passed
        boolean result = false;
        boolean increasing = false;
        boolean decreasing = false;
        if (nums.length == 1) return true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i] && !decreasing) {
                result = true;
                increasing = nums[i - 1] != nums[i];
            } else if (nums[i - 1] >= nums[i] && !increasing) {
                result = true;
                decreasing = nums[i - 1] != nums[i];
            } else {
                return false;
            }
        }
        return result;
    }
}
