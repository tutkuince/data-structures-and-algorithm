package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Two Number Sum
// Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
// If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.
// If no two numbers sum up to the target sum, the function should return an empty array.

// Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer to itself
// in order to obtain the target sum.

// You can assume that there will be at most one pair of numbers summing up to the target sum.

public class TwoNumberSum {
    public static void main(String[] args) {
        // Sample Input
        int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        // Sample Output
        // [-1, 11] // the numbers could be in reverse order
        System.out.println(Arrays.toString(twoNumberSum2(array, targetSum)));
    }

    // O(nlog(n)) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        // [ -4, -1, 1, 3, 5, 6, 8, 11 ]
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right++;
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        // [ -4, -1, 1, 3, 5, 6, 8, 11 ]
        // [ 3, 5, -4, 8, 11, 1, -1, 6 ], targetSum = 10
        Set<Integer> numbers = new HashSet<>();
        int[] result = new int[2];
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (numbers.contains(potentialMatch)) {
                result = new int[]{potentialMatch, num};
                Arrays.sort(result);
                return result;
            }
            numbers.add(num);
        }
        return new int[0];
    }


}
