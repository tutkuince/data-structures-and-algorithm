package io.tince.reboot.day01_arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Anagram
 * <p>
 * Given two strings "s" and "t", return true if "t" is an anagram of "s", and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1: Input
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("Result: " + new ValidAnagram().validAnagram("kedik", "dekik"));
    }

    // Approach: HashMap
    // Works for any character set
    // Time Complexity: O(n)
    // Space Complexity: O(k) where k is the number of unique characters.
    public boolean validAnagram(String s, String t) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            characterCountMap.put(charAt, characterCountMap.getOrDefault(charAt, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char charAt = t.charAt(i);
            if (!characterCountMap.containsKey(charAt) || characterCountMap.get(charAt) == 0) {
                return false;
            }
            characterCountMap.put(charAt, characterCountMap.get(charAt) - 1);
        }
        return true;
    }

    // Approach: Integer Array (Optimized for lowercase English letters)
    // Since the problem constraints often specify "lowercase English letters",
    // we can use a fixed-size array instead of a HashMap for better performance.
    // Time Complexity: O(n) - Faster than HashMap due to direct memory access.
    public boolean isAnagramArray(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; // 26 letters in English alphabet

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment for s
            count[t.charAt(i) - 'a']--; // Decrement for t
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
