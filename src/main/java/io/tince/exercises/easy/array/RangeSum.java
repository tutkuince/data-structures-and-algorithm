package io.tince.exercises.easy.array;

public class RangeSum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 3, 6, 5};
        System.out.println(sumRange(1, 3, nums));
        System.out.println(sumRange(0, 2, nums));
        System.out.println(sumRange(2, 5, nums));
    }

    public static int sumRange(int startIndex, int endIndex, int[] nums) {
        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = nums[i] + prefix[i];
        }

        return prefix[endIndex + 1] - prefix[startIndex];
    }
}
