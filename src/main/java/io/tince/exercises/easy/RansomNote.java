package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Ransom Note
 * <p>
 * Given two strings "ransomNote" and "magazine", return 'true' if "ransomNote" can be constructed by using the letters from "magazine" and 'false' otherwise.
 * <p>
 * Each letter in "magazine" can only be used once in "ransomNote".
 * <p>
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * <p>
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * <p>
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        // TODO: Implement Solution
        return false;
    }
}
