package io.tince.exercises.easy;

import java.util.*;

/**
 * Reverse Vowels of a String
 * <p>
 * Given a string "s", reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * <p>
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 * <p>
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfAString().reverseVowels("hello"));
        System.out.println(new ReverseVowelsOfAString().reverseVowels("leetcode"));
        System.out.println(new ReverseVowelsOfAString().reverseVowels("aA"));
    }
    public String reverseVowels(String s) {
        List<Character> vowelCharacters = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        char[] inputArray = s.toCharArray();
        int start = 0;
        int end = inputArray.length - 1;
        while (start < end) {
            if (!vowelCharacters.contains(inputArray[start])) {
                start++;
            } else if (!vowelCharacters.contains(inputArray[end])) {
                end--;
            } else {
                char temp = inputArray[start];
                inputArray[start] = inputArray[end];
                inputArray[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(inputArray);
    }
}
