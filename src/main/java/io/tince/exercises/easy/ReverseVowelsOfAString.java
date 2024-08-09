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
        Map<Integer, Character> indexCharacterMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if (vowelCharacters.contains(s.charAt(i))) {
                indexCharacterMap.put(i, s.charAt(i));
            }
        }
        int counter = 0;
        for (int i = 0; i < result.length() / 2; i++) {
            if (vowelCharacters.contains(result.charAt(i))) {
                char temp = result.charAt(i);
                Integer index = Collections.max(indexCharacterMap.entrySet(), Map.Entry.comparingByKey()).getKey();
                result.setCharAt(i, indexCharacterMap.get(index));
                result.setCharAt(index, temp);
                indexCharacterMap.remove(index);
            }
        }
        // TODO
        return result.toString();
    }
}
