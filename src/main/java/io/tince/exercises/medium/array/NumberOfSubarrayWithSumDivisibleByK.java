package io.tince.exercises.medium.array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarrayWithSumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        System.out.println(subarrayWithSumDivisibleByK(nums, 5));
    }

    public static int subarrayWithSumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> numsCountMap = new HashMap<>();
        numsCountMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int mod = ((prefixSum % k) + k) % k;

            if (numsCountMap.containsKey(mod)) {
                count += numsCountMap.get(mod);
            }

            numsCountMap.put(mod, numsCountMap.getOrDefault(mod, 0) + 1);
        }
        return count;
    }
}
