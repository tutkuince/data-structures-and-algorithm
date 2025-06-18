package io.tince.exercises.easy.array;

public class RangeSum {
    private int[] prefixSum;

    public static void main(String[] args) {
        int[] nums = {3, 2, -1, 6, 5, 4, -3, 3};
        RangeSum rangeSum = new RangeSum(nums);
        System.out.println(rangeSum.sumRange(0, 2));
        System.out.println(rangeSum.sumRange(3, 5));
        System.out.println(rangeSum.sumRange(0, 7));
        System.out.println(rangeSum.sumRange(2, 6));
    }

    public RangeSum(int[] nums) {
        prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int startIndex, int endIndex) {
        return prefixSum[endIndex + 1] - prefixSum[startIndex];
    }
}
