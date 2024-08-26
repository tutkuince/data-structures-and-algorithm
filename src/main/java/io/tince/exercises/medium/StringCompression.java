package io.tince.exercises.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * String Compression
 * <p>
 * Given an array of characters "chars", compress it using the following algorithm:
 * Begin with an empty string "s". For each group of consecutive repeating characters in "chars"
 * - If the group's length is 1, append the character to "s"
 * - Otherwise, append the character followed by the group's length.
 * <p>
 * The compressed string "s" should not be returned separately, but instead, be stored in the input character array "chars".
 * Note that group length that are 10 or longer will be split into multiple characters in "chars".
 * <p>
 * After you done modifying the input array, return the new length of the array.
 * You must write an algorithm that uses only constant extra space.
 * <p>
 * Example 1:
 * Input: chars = ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 * <p>
 * Example 2:
 * Input: chars = ["a"]
 * Output: Return 1, and the first character of the input array should be: ["a"]
 * Explanation: The only group is "a", which remains uncompressed since it's a single character.
 * <p>
 * Example 3:
 * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */

public class StringCompression {
    public static void main(String[] args) {
        char[] chars1 = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] chars2 = new char[]{'a'};
        char[] chars3 = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(new StringCompression().compress(chars1));
    }

    public int compress(char[] chars) {
        char previousChar = chars[0];
        int count=1;
        StringBuilder sb = new StringBuilder();

        // STEP-1 : iterate through input array
        for(int i=1; i<chars.length; i++){
            char currentChar = chars[i];

            // STEP-2 : if current char is matched with previous char, then increase the count
            if(previousChar == currentChar){
                count++;
            }
            // STEP-3 : else add the character and count in the answer String builder
            else {
                sb.append(previousChar);
                if(count > 1) sb.append(count);
                previousChar = currentChar;
                count=1;
            }
        }
        sb.append(previousChar);
        if(count > 1) sb.append(count);

        // STEP-4 : copy answer from StringBuilder to input array
        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }

    public int compress2(char[] chars) {
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
                if (i == chars.length - 1) {
                    count = getCount(chars, result, i, count);
                }
            } else {
                count = getCount(chars, result, i, count);
            }
        }
        chars = new char[result.length()];
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }
        return result.length();
    }

    private static int getCount(char[] chars, StringBuilder result, int i, int count) {
        result.append(chars[i - 1]);
        if (count >= 10) {
            String value = String.valueOf(count);
            for (int j = 0; j < value.length(); j++) {
                result.append(value.charAt(j));
            }
        } else if (count > 1) result.append(count);
        count = 1;
        return count;
    }

    public int compress1(char[] chars) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }
        for (Character c : characterCountMap.keySet()) {
            result.append(c);
            if (characterCountMap.get(c) >= 10) {
                String value = String.valueOf(characterCountMap.get(c));
                for (int i = 0; i < value.length(); i++) {
                    result.append(value.charAt(i));
                }
            } else if (characterCountMap.get(c) > 1) result.append(characterCountMap.get(c));
        }
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }
        return result.length();
    }
}
