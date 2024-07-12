package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Can Make Arithmetic Progression From Sequence
 * <p>
 * A sequence of numbers is called an *arithmetic progression* if the difference between any two consecutive elements is the same.
 * <p>
 * Given an array of numbers "arr", return "true" if the array can be rearranged to form an *arithmetic progression*. Otherwise, return "false".
 * <p>
 * Example 1:
 * Input: arr = [3,5,1]
 * Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
 * <p>
 * Example 2:
 * Input: arr = [1,2,4]
 * Output: false
 * Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 */
public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1};
        System.out.println(new CanMakeArithmeticProgression().canMakeArithmeticProgression(arr));
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int resultAfterSortingAsAscOrder = arr[1] - arr[0];

        int[] reverseOrder = new int[arr.length];
        int counter = 0;
        for (int i = reverseOrder.length - 1; i >= 0; i--) {
            reverseOrder[counter] = arr[i];
            counter++;
        }
        int resultAfterSortingAsDescOrder = reverseOrder[0] - reverseOrder[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + resultAfterSortingAsDescOrder) return false;
        }
        return resultAfterSortingAsAscOrder == resultAfterSortingAsDescOrder;
    }
}
