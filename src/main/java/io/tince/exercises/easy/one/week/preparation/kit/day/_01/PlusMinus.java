package io.tince.exercises.easy.one.week.preparation.kit.day._01;

import java.util.Arrays;
import java.util.List;

/**
 * Plus Minus
 * <p>
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.
 * <p>
 * Note: This challenge introduces precision problems.
 * The test cases are scaled to six decimal places, though answers with absolute error of up to 10^-4 are acceptable.
 * <p>
 * Example:
 * arr = [1, 1, 0, -1, -1]
 * There are n = 5 elements, two positives, two negative and one zero. Their ratios are 2/5 = 0.400000, 2/5 = 0.400000 and 1/5 = 0.200000
 * Results are printed as:
 * 0.400000
 * 0.400000
 * 0.200000
 * <p>
 * Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with 6 digits after the decimal.
 * The function should not return a value
 */
public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(numberList);
    }

    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (Integer number : arr) {
            if (number > 0) positiveCount++;
            else if (number < 0) negativeCount++;
            else zeroCount++;
        }
        double resultForPositive = (double) positiveCount / arr.size();
        double resultForNegative = (double) negativeCount / arr.size();
        double resultForZero = (double) zeroCount / arr.size();
        System.out.printf("%.6f%n", resultForPositive);
        System.out.printf("%.6f%n", resultForNegative);
        System.out.printf("%.6f%n", resultForZero);
    }
}
