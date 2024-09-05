package io.tince.exercises.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Majority Element
 * <p>
 * Given an array "nums" of size "n", return the majority element.
 * <p>
 * The majority element is the element that appears more than "[n / 2]" times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 3};
        int[] nums2 = new int[]{2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums2));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        int n = nums.length / 2;
        for (int i : nums) {
            numberCountMap.put(i, numberCountMap.getOrDefault(i, 0) + 1);
        }
        int largestNumber = 0;
        for (Integer num: numberCountMap.keySet()) {
            if (numberCountMap.get(num) > n) {
                largestNumber = num;
            }
        }
        return largestNumber;
    }
}
