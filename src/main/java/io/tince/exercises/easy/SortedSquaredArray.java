package io.tince.exercises.easy;

import java.util.Arrays;

// Sorted Squared Array
// Write a function that takes in a non-empty array of integers that are sorted in ascending order and
// returns a new array of the same length with the squares of the original integers also sorted in ascending order.
public class SortedSquaredArray {

    public static void main(String[] args) {
        // Sample Input
        int[] array = new int[]{-7, -3, 1, 9, 22, 30};
        // Sample Output
        // [1, 4, 9, 25, 36, 64, 81];
        System.out.println(Arrays.toString(sortedSquaredArray2(array)));
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

    public static int[] sortedSquaredArray2(int[] array) {
        // Write your code here.
        int[] sortedSquares = new int[array.length];
        int smallerValueIdx = 0;
        int largerValueIdx = array.length - 1;
        for (int idx = array.length - 1; idx >= 0; idx--) {
            int smallerValue = array[smallerValueIdx];
            int largerValue = array[largerValueIdx];
            if (Math.abs(smallerValue) > Math.abs(largerValue)) {
                sortedSquares[idx] = smallerValue * smallerValue;
                smallerValueIdx++;
            } else {
                sortedSquares[idx] = largerValue * largerValue;
                largerValueIdx--;
            }
        }
        return sortedSquares;
    }
}
