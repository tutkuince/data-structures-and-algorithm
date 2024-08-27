package io.tince.exercises.easy;

/**
 * Is Subsequence
 * <p>
 * Given two strings "s" and "t", return true if "s" is a subsequence of "t", or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (i.e., "ace" is subsequence of "abcde" while "aec" is not)
 * <p>
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;
        int letter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(letter) == t.charAt(i)) {
                letter++;
                if (letter >= s.length()) return true;
            }
        }
        return false;
    }
}
