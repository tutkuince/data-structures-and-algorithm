package io.tince.exercises.medium.array;

import java.util.Arrays;

/**
 * Smallest Difference
 * <p>
 * Write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array)
 * whose absolute difference is closest to zero, and returns an array containing these two numbers, with the number from the first array in the first position.
 * <p>
 * Note that the absolute difference of two integers is the difference between them on the real number line.
 * For example, the absolute difference of -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.
 * <p>
 * You can assume that there will only be one pair of numbers with the smallest difference.
 *
 * Sample Input:
 * arrayOne = [-1, 5, 10, 20, 28, 3]
 * arrayTwo = [26, 134, 135, 15, 17]
 * Sample Output:
 * [28, 26]
 */
public class SmallestDifference {
    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        int[] result = new int[2];

        Arrays.sort(arrayOne);  // [-1, 3, 5, 10, 20, 28]
        Arrays.sort(arrayTwo);  // [15, 17, 26, 134, 135]
        int pointerOne = 0;
        int pointerTwo = 0;

        int smallestDifference = Integer.MAX_VALUE;

        while (pointerOne < arrayOne.length && pointerTwo < arrayTwo.length) {
            int valueOne = arrayOne[pointerOne];
            int valueTwo = arrayTwo[pointerTwo];

            int difference = Math.abs(valueOne - valueTwo);
            if (smallestDifference > difference) {
                smallestDifference = difference;
                result = new int[]{valueOne, valueTwo};
            }

            if (valueOne < valueTwo) {
                pointerOne++;
            } else {
                pointerTwo++;
            }
        }

        return result;
    }
}
