package io.tince.exercises.easy.array;

import java.util.*;

/**
 * Intersection of Two Arrays II
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * <p>
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] nums11 = {4,9,5};
        int[] nums22 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums11, nums22)));
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        int nums[] = new int[1001];

        for (int i = 0; i < nums1.length;i++){
            nums[nums1[i]]++;
        }
        int count=0;
        for(int i=0;i<nums2.length;i++){
            if(nums[nums2[i]]!=0){
                nums1[count++]=nums2[i];
                nums[nums2[i]]--;
            }
        }
        int ans[]=new int[count];
        for(int i=0;i<count;i++){
            ans[i]=nums1[i];
        }
        return ans;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numberCountMap = new TreeMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int number = nums1[i];
            numberCountMap.put(number, numberCountMap.getOrDefault(number, 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            int number = nums2[i];
            if (numberCountMap.containsKey(number) && numberCountMap.get(number) > 0) {
                int count = numberCountMap.get(number);
                numberCountMap.put(number, --count);
                result.add(number);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
