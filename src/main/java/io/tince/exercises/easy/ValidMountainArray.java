package io.tince.exercises.easy;

/**
 * Valid Mountain Array
 * <p>
 * Given an array of integers, return true if the following conditions are fulfilled
 * <p>
 * Length of the array is bigger than or equal to 3
 * There exists some index i such that
 * a[0] < a[1] < ... < a[i]
 * a[i] > a[i + 1] > ... > a[a.size - 1]
 * <p>
 * In a nutshell: Find if there is an increasing subarray followed by a decreasing subarray
 * <p>
 * The array size will be at least 1, in that case return false
 * <p>
 * You need at least 3 elements for a chance of returning true, if you receive an array of size less than 3, return false
 * <p>
 * Test Case: [0, 3, 2, 1]
 * - Is the array size smaller than 3? -> No
 * - Is there a strictly increasing sequence, from start of the array to some point? -> Yes =>  0, 3
 * - Is there a strictly decreasing sequence, that starts after the increasing sequence? -> Yes => 2, 1
 * - Do we have elements left to cover in the array after the decreasing sequence? -> No
 */
public class ValidMountainArray {
    public static void main(String[] args) {
        int[] input = new int[]{0, 3, 2, 1};
        boolean result = new ValidMountainArray().validaMountainArray(input);
        System.out.println("Result is: " + result);
    }

    public boolean validaMountainArray(int[] input) {
        int i = 1;
        while (i < input.length && input[i] > input[i - 1]) {
            i++;
        }
        if (i == 1 || i == input.length) return false;
        while (i < input.length && input[i] < input[i - 1]) {
            i++;
        }
        return i == input.length;
    }
}
