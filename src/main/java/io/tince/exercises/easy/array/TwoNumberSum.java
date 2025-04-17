package io.tince.exercises.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Two Number Sum
 * <p>
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.
 * If no two numbers sum up to the target sum, function should return an empty array.
 * <p>
 * Note that the target sum has to be obtained by summing two different integers in the array;
 * you can't add a single integer to itself in order to obtain the target sum.
 * <p>
 * You can assume that there will be at most one pair of numbers summing up to the target sum.
 *
 * Sample Input:
 * array = [3, 5, -4, 8, 11, 1, -1, 6]
 * targetSum = 10
 *
 * Sample Output: [-1, 11] the numbers could be in reverse order.
 */
public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> numbers = new HashSet<>();
        int[] result = new int[2];
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (numbers.contains(potentialMatch)) {
                result = new int[]{num, potentialMatch};
                return result;
            }
            numbers.add(num);
        }
        return new int[0];
    }
}
