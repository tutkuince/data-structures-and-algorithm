package io.tince.exercises.easy.array;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Plus One
 * <p>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * <p>
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * <p>
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * <p>
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9};
        System.out.println(Arrays.toString(plusOne3(digits)));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            result.append(digits[i]);
        }
        BigInteger i = new BigInteger(result.toString());
        i = i.add(new BigInteger("1"));
        String string = i.toString();
        digits = new int[string.length()];
        for (int j = 0; j < digits.length; j++) {
            digits[j] = Character.getNumericValue(string.charAt(j));
        }
        return digits;
    }

    public static int[] plusOne3(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDig = new int[digits.length + 1];
        newDig[0] = 1;
        return newDig;
    }

    public static int[] plusOne2(int[] digits) {
        long calculationResult = 0;
        long divisor = 1;
        for (int i = digits.length - 1; 0 <= i; i--) {
            int digit = digits[i];
            calculationResult += (digit * divisor);
            divisor *= 10;
        }
        calculationResult++;
        String strResult = String.valueOf(calculationResult);
        digits = new int[strResult.length()];
        for (int i = 0; i < strResult.length(); i++) {
            char c = strResult.charAt(i);
            digits[i] = Character.getNumericValue(c);
        }
        return digits;
    }
}
