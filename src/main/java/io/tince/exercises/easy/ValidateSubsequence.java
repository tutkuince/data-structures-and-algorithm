package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Validate Subsequence
// Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.
// A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the same order as they appear in the array.
// For instance, the numbers [1, 3, 4] form a subsequence of the array [1, 2, 3, 4], and so do the numbers [2, 4].
// Note that a single number in an array and the array itself are both valid subsequences of the array.
public class ValidateSubsequence {
    public static void main(String[] args) {
        /*List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);*/
        List<Integer> array = Arrays.asList(1, 2, 3, 4);
        List<Integer> sequence = Arrays.asList(2, 4);
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int order = 0;
        for (Integer number :array) {
            if (sequence.contains(number)) {
                if (number.equals(sequence.get(order))) {
                    order++;
                    if (order == sequence.size()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        // TODO
        // array [1, 2, 3, 4], sequence [1, 3, 4]
        int order = 0;
        for (Integer number: array) {
            if (order == sequence.size()) {
                break;
            }
            if (number.equals(sequence.get(order))) {
                order++;
            }
        }
        return order == sequence.size();
    }
}
