package io.tince.reboot.day02_two_pointer;

/**
 * Valid Palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
 * all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string "s", return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama" Output: true
 * Explanation: amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car" output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("Result: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Result: " + isPalindrome("race a car"));
    }

    // Approach: String Builder (Filter & Reverse)
    // This is the naive approach where we create new string containing only valid characters, and then compare it.
    // Time Complexity: O(n): We iterate through the string twice (once to clean, once to compare).
    // Space Complexity: O(n): we use extra memory(StringBuilder) to store the filtered string.
    public static boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                result.append(Character.toLowerCase(currentChar));
            }
        }

        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - 1 -i)) {
                return false;
            }
        }
        return true;
    }

    // Approach: Two Pointers (Optimal Solution)
    // We use two pointers starting from the beginning and the end.
    // We move them towards each other, skipping non-alphanumeric characters.
    // Time Complexity: O(n): we traverse the string only once.
    // Space Complexity: O(1): No extra memory is allocated for a new string. we operate in-place.
    public static boolean isPalindromeV2(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
