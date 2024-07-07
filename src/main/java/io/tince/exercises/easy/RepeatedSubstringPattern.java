package io.tince.exercises.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Repeated Substring Pattern
 *
 * Given a string "s", check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 *
 * Example 1:
 *  Input: s = "abab"
 *  Output: true
 *  Explanation: It is the substring "ab" twice
 *
 * Example 2:
 *  Input: s = "aba"
 *  Output false
 *
 * Example 3:
 *  Input: s = "abcabcabcabc"
 *  Output: true
 *  Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 *
 * Constraints:
 *  - 1 <= s.length <= 10^4
 *  - s consists of lowercase English letters.
 * */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("abcdab"));
    }
    public boolean repeatedSubstringPattern(String s) {
        Set<String> uniqueStr = new HashSet<>();
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }
        for (int i = 2; i <= s.length() / 2; i++) {
            if (!uniqueStr.contains(s.substring(0, i))) uniqueStr.add(s.substring(0, i));
            else return true;
        }
        for (int i = 2; i < s.length(); i++) {
            if (uniqueStr.contains(s.substring(i))) return true;
        }
        return false;
    }
}
