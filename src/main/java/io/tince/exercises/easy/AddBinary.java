package io.tince.exercises.easy;

/**
 * Add Binary
 *
 * Given two binary strings "a" and "b", return their sum as a binary string.
 *
 * Example 1:
 *  Input: a = "11", b = "1"
 *  Output: "100"
 *
 * Example 2:
 *  Input: a = "1010", b = "1011"
 *  Output: "10101"
 *
 * Constraints:
 *  - 1 <= a.length, b.length <= 10^4
 *  - "a" and "b" consist only of '0' or '1' characters.
 *  - Each string does not contain leading zeros except for the zero itself.
 *
 * */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        int reversedIndexA = a.length() - 1;
        int reversedIndexB = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (reversedIndexA >= 0 || reversedIndexB >= 0 || carry == 1) {
            if (reversedIndexA >= 0) {
                carry += Character.getNumericValue(a.charAt(reversedIndexA));
                reversedIndexA--;
            }
            if (reversedIndexB >= 0) {
                carry += Character.getNumericValue(b.charAt(reversedIndexB));
                reversedIndexB--;
            }
            result.insert(0, carry % 2);
            carry /= 2;
        }
        return result.toString();
    }
}
