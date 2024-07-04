package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Move Zeros
 *
 * Given an array of integers, write a function to move all 0's to the end while maintaining
 * the relative order of the other elements
 *
 * Example: [0, 1, 0, 3, 12]
 * Expected Output: [1, 3, 12, 0, 0]
 *
 * Elements are not sorted.
 * Entire array can only consist of zeroes.
 *
 * */
public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(new MoveZeros().moveZerosBruteForceApproach(numbers)));
        System.out.println(Arrays.toString(new MoveZeros().moveZerosOptimalSolution(numbers)));
    }

    // Optimal Solution
    // Time Complexity:  O(n + m)
    // Space Complexity: O(1)
    public int[] moveZerosOptimalSolution(int[] numbers) {
        int nonZeroCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[nonZeroCounter] = numbers[i];
                nonZeroCounter++;
            }
        }
        for (int i = nonZeroCounter; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        return numbers;
    }


    // Brute Force
    // Time Complexity:  O(n+n-m) -> O(2n-m)
    // Space Complexity: O(n)
    public int[] moveZerosBruteForceApproach(int[] numbers) {
        int[] result = new int[numbers.length];
        int nonZeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result[nonZeroCount] = numbers[i];
                nonZeroCount++;
            }
        }
        for (int i = nonZeroCount; i < numbers.length; i++) {
            result[nonZeroCount] = 0;
        }
        return result;
    }
}
