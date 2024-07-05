package io.tince.exercises.easy;

/**
 * Find the Index of the First Occurrence in a String
 * Given two strings "needle" and "haystack", return the index of the first occurrence of "needle" in "haystack" or "-1" if "needle is not part of "haystack"
 *
 * Example 1:
 * Input: haystack = "sadbutsat", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" didnt occur in "leetcode", so we return -1.
 *
 * Constraints:
 *  - 1 <= haystack.length, needle. length <= 10^4
 *  - haystack and needle consist of only lowercase English characters.
 * */
public class FindIndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(new FindIndexOfFirstOccurrence().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() >= 1 && needle.length() <= 100_000) {
            if (haystack.contains(needle)) {
                for (int i = 0; i < haystack.length(); i++) {
                    if (haystack.startsWith(needle, i)) return i;
                }
            }
        }
        return -1;
    }
}
