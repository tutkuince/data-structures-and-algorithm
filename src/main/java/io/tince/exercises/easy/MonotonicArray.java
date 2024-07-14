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
        System.out.println(new MonotonicArray().isMonotonic(nums4));
    }

    // Brute Force
    public boolean isMonotonic(int[] nums) {
        boolean result = false;
        boolean increasing = false;
        boolean decreasing = false;
        int increasingCount = 0;
        int decreasingCount = 0;

        if (nums.length == 1) return true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i] && !decreasing && decreasingCount == 0) {
                result = true;
                if (nums[i - 1] != nums[i]) {
                    increasingCount++;
                    increasing = true;
                }

            } else if (nums[i - 1] >= nums[i] && !increasing && increasingCount == 0) {
                result = true;
                if (nums[i - 1] != nums[i]) {
                    decreasingCount++;
                    decreasing = true;
                }
            } else {
                return false;
            }
        }
        return result;
    }

    // Optimal Solution
    public boolean isMonotonic2(int[] nums) {
        boolean aes = nums[0] < nums[nums.length-1];

        if(aes){
            for(int i=0; i < nums.length - 1; i++){
                if(nums[i] > nums[i+1]) return false;
            }
        }
        else {
            for(int i=0; i < nums.length - 1; i++){
                if(nums[i] < nums[i+1]) return false;
            }
        }

        return true;
    }

    // less code
    public boolean isMonotonic3(int[] nums) {
        boolean monoInc = false;
        boolean monoDec = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 0) {
                monoInc = true;
                if (monoDec) {
                    return false;
                }
            } else if (nums[i + 1] - nums[i] < 0) {
                monoDec = true;
                if (monoInc) {
                    return false;
                }
            }
        }
        return true;
    }
}
