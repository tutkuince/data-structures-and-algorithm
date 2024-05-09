package io.tince._10hashtables.interview.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find Duplicates
 *
 * Problem: Given an array of integers "nums", find all the duplicates in the array using a hash table (HashMap).
 *
 * Input: An array of integers "nums".
 * Return Type:
 *  - List<Integer> implemented as an ArrayList
 *
 * */
public class FindDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

    // Solution 1
    private static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Boolean> resultMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (resultMap.containsKey(num) && !result.contains(num)) {
                result.add(num);
            } else {
                resultMap.put(num, true);
            }
        }
        return result;
    }

    // Solution 2
    public static List<Integer> findDuplicates2(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}
