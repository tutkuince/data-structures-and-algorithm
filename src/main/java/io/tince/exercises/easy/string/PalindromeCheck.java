package io.tince.exercises.easy.string;

/**
 * Palindrome Check
 *
 * Write a function that takes in a non-empty string and that returns a boolean representing whether the string is a palindrome.
 *
 * A palindrome is defined as a string that's written the same forward and backward. Note that single-character strings are palindromes.
 *
 * Sample Input:
 * str = "abcdcba";
 * Sample Output: true
 *
 * */
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("abcdcba"));
        System.out.println(isPalindrome2("abcddcba"));
        System.out.println(isPalindrome2("a"));
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        // Write your code here.
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString().equals(str);
    }
}
