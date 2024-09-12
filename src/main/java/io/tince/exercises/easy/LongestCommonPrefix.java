package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs2 = new String[]{"dog", "racecar", "car"};
        String[] strs3 = new String[]{"reflower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    // Brute Force Approach
    public static String longestCommonPrefix2(String[] strs) {
        int minLetterCount = Integer.MAX_VALUE;
        String result = "";
        Map<String, Integer> stringCountMap = new HashMap<>();
        for (String str : strs) {
            if (str.length() < minLetterCount) minLetterCount = str.length();
        }
        for (String str : strs) {
            for (int i = 0; i < minLetterCount; i++) {
                String currentValue = str.substring(0, i + 1);
                stringCountMap.put(currentValue, stringCountMap.getOrDefault(currentValue, 0) + 1);
            }
        }
        if (!stringCountMap.isEmpty()) {
            int maxValue = strs.length;
            int letterCount = 0;
            for (String str : stringCountMap.keySet()) {
                if (maxValue != 1 && stringCountMap.get(str) == maxValue && letterCount < str.length()) {
                    letterCount = str.length();
                    result = str;
                }
                if (stringCountMap.size() == 1) {
                    result = str;
                }
            }
        }
        return result;
    }
}
