package io.tince.exercises.medium.array;

/**
 * Monotonic Array
 * Write a function that takes in an array of integers and returns a boolean representing whether the array is monotonic.
 * An array is said to be monotonic if its elements, from left to right, are entirely non-increasing or entirely non-decreasing.
 *
 * Non-increasing elements aren't necessarily exclusively decreasing; the simply don't increase.
 * Similarly, non-decreasing elements aren't necessarily exclusively increasing; they simply don't decrease.
 * Note that empty arrays and arrays of one element are monotonic.
 *
 * Sample Input: array = [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
 * Sample Output: true
 *
 * */
public class MonotonicArray {
    public static void main(String[] args) {
        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic2(array));
    }

    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < array.length; i++) {
            int prev = array[i - 1];
            int current = array[i];
            if (prev > current) {
                increasing = true;
            }
            if (prev < current) {
                decreasing = true;
            }

            if (increasing && decreasing) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotonic2(int[] array) {
        // Write your code here.
        if (array.length <= 1) return true;
        boolean isDecreasing = array[0] > array[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            int prev = array[i - 1];
            int curr = array[i];
            if (isDecreasing && prev < curr) {
                return false;
            }
            if (!isDecreasing && prev > curr) {
                return false;
            }
        }
        return true;
    }
}
