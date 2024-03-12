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
        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));
    }

    // O(n) time | O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> numbersSet = new HashSet<>();
        for (int num :array) {
            int potentialMatch = targetSum - num;
            if (numbersSet.contains(potentialMatch)) {
                return new int[]{potentialMatch, num};
            } else {
                numbersSet.add(num);
            }
        }
        return new int[0];
    }

    // O(n^2) time | O(1) space
    /*public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] result = {};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    result = new int[]{array[i], array[j]};
                    Arrays.sort(result);
                    return result;
                }
            }
        }
        return result;
    }*/
}
