package io.tince.exercises.easy;

import java.util.Arrays;

// Sorted Squared Array
// Write a function that takes in a non-empty array of integers that are sorted in ascending order and
// returns a new array of the same length with the squares of the original integers also sorted in ascending order.
public class SortedSquaredArray {

    public static void main(String[] args) {
        // Sample Input
        int[] array = new int[]{1, 2, 3, 5, 6, 8, 9};
        // Sample Output
        // [1, 4, 9, 25, 36, 64, 81];
    }

    // O(nlogn) time | O(n) space
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;
    }
}
