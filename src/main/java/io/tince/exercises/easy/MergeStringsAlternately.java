package io.tince.exercises.easy;

/**
 * Merge Strings Alternately
 * <p>
 * You are given two strings "word1" and "word2". Merge the strings by adding letters in alternating order, starting with "word1".
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * <p>
 * E1:
 * - Input: word1 = "abc", word2 = "pqr"
 * - Output: "apbqcr"
 * E2:
 * - Input: word1 = "ab", word2 = "pqrs"
 * - Output: "apbqrs"
 * E3:
 * - Input: word1 = "abcd", word2 = "pq"
 * - Output: "apbqcd"
 *
 * Constraints:
 *  - 1 <= word1.length, word2.length <= 100
 *  - word1 and word2 consist of lowercase English letters
 */
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String result1 = new MergeStringsAlternately().mergeAlternately("abc", "pqr");
        System.out.println("Output should be: apbqcr => " + "apbqcr".equals(result1) + " and result is: " + result1);

        String result2 = new MergeStringsAlternately().mergeAlternately("ab", "pqrs");
        System.out.println("Output should be: apbqrs => " + "apbqrs".equals(result2) + " and result is: " + result2);

        String result3 = new MergeStringsAlternately().mergeAlternately("abcd", "pq");
        System.out.println("Output should be: apbqcd => " + "apbqcd".equals(result3) + " and result is: " + result3);
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result  = new StringBuilder();
        if (!word1.isEmpty() && word2.length() <= 100) {
            int counter = Math.max(word1.length(), word2.length());
            for (int i = 0; i < counter; i++) {
                if (i < word1.length()) result.append(word1.charAt(i));
                if (i < word2.length()) result.append(word2.charAt(i));
            }
        }

        /*
        Brute Force Approach
        // Case 1: Word1.length == Word2.length
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
        }

        // Case 2: Word1.length > Word2.length
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                result.append(word1.charAt(i));
                if (i < word2.length()) {
                    result.append(word2.charAt(i));
                }
            }
        }

        // Case 3: Word1.length < Word2.length
        if (word1.length() < word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                if (i < word1.length()) {
                    result.append(word1.charAt(i));
                }
                result.append(word2.charAt(i));
            }
        }*/

        return result.toString();
    }
}
