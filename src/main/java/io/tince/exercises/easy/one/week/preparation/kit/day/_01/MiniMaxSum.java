package io.tince.exercises.easy.one.week.preparation.kit.day._01;

import java.util.Arrays;
import java.util.List;

/**
 * Mini-Max Sum
 * <p>
 * Give five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * <p>
 * arr = [1, 3, 5, 7, 9]
 * The minimum sum is 1 + 3 + 5 + 7 = 16 and the maximum sum is 3 + 5 + 7 + 9 = 24. The function prints 16 24
 * <p>
 * Print
 * Print two space-separated integers on one line: the minimum sum and the maximum sum of of elements.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(942381765, 627450398, 954173620, 583762094, 236817490);
        miniMaxSum(numberList);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minimum = Long.MAX_VALUE;
        long maximum = Long.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            long total = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    total += arr.get(j);
                }
            }
            if (total > maximum) maximum = total;
            if (minimum > total) minimum = total;
        }
        System.out.println(minimum + " " + maximum);
    }
}
