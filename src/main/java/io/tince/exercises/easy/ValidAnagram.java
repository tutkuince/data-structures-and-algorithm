package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Valid Anagram
 *
 * Given two strings "s" and "t", return true if "t" is an anagram of "s", and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 *  Input: s = "anagram", t = "nagaram"
 *  Output: true
 *
 * Example 2:
 *  Input: s = "rat", t = "car"
 *  Output: false
 *
 * Constraints:
 *  - 1 <= s.length, t.length <= 5 * 10^4
 *  - "s" and "t" consist of lowercase English letters.
 * */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    // Brute Force
    public boolean isAnagramBruteForce(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
        }
        for (int val : charCountMap.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}
