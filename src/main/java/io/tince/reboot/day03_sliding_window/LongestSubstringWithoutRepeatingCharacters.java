package io.tince.reboot.day03_sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 * <p>
 * Given a string "s", find the length of the longest substring without repeating characters.
 * Example 1: Input: s = "abcabcbb" Output: 3
 * Explanation: The answer is "abc" with the length of 3.
 * <p>
 * Example 2: Input: s = "bbbbb" Output: 1
 * Explanation: The answer is "b" with the length of 1.
 * <p>
 * Example 3: Input: s = "pwwkew" Output: 3
 * Explanation: The answer is "wke", with the length of 3. Notice that the answer must be substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Result: " + longestSubstring("abcabcbb"));
        System.out.println("Result: " + longestSubstring("bbbbb"));
        System.out.println("Result: " + longestSubstring("pwwkew"));
    }

    // Approach: Sliding Window
    // We use a HashSet to store characters in the current window. [left, right]
    // If we encounter a duplicate, we shrink the window from the left until duplicate is removed.
    // Time Complexity: O(n) - Each character is visited at most twice
    // Space Complexity: O(min(n, m)) - Set stores unique characters (m is alphabet size)
    public static int longestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longestValue = 0;
        Set<Character> uniqueChars = new HashSet<>();
        while (right < s.length()) {
            while (uniqueChars.contains(s.charAt(right))) {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
            uniqueChars.add(s.charAt(right));
            longestValue = Math.max(longestValue, right - left + 1);
            right++;
        }
        return longestValue;
    }
}
