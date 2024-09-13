package io.tince.exercises.easy;

/**
 * Valid Palindrome
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * <p>
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        // System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        int length = result.length();
        for (int i = 0; i < length / 2; i++) {
            if (result.charAt(i) != result.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
