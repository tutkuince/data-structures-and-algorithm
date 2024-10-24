package io.tince.exercises.easy.string;

/**
 * Reverse Integer
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Example 1:
 * Input: x = 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: x = -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: x = 120
 * Output: 21
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        // "9646324351" 1534236469
    }

    public static int reverse2(int x) {
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10; // Get the last digit
            x /= 10; // Remove the last digit

            // Check for overflow before actually adding the digit to the reversed number
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow case
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Underflow case
            }

            reversed = reversed * 10 + pop;
        }

        return reversed;
    }

    public static int reverse(int x) {
        String str = Integer.toString(Math.abs(x));

        // Reverse the string
        StringBuilder reversedStr = new StringBuilder(str).reverse();

        // Convert the reversed string back to an integer
        try {
            int reversed = Integer.parseInt(reversedStr.toString());

            // If the original number was negative, make the result negative
            return x < 0 ? -reversed : reversed;
        } catch (NumberFormatException e) {
            // If the reversed number exceeds the 32-bit integer range, return 0
            return 0;
        }
    }
}
