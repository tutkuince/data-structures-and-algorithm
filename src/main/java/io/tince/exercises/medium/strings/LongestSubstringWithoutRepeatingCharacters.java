package io.tince.exercises.medium.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 * <p>
 * Given a string s, find the length of the longest substring without duplicate characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueCharList = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
            char current = s.charAt(right);

            if (!uniqueCharList.contains(current)) {
                uniqueCharList.add(current);
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                uniqueCharList.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
