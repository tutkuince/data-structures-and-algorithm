package io.tince.exercises.medium.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Subarray Sum Equals K
 * Given an array of integers nums and an integer k, return the total number of subarray whose sum equals to k.
 *
 * A subarray is contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * */
public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1,2,3};
        int[] nums3 = {-1,-1,1};
        System.out.println(subarraySum(nums1, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
