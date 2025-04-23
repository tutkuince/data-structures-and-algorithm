package io.tince.exercises.easy.string;

import java.util.*;

/**
 * First Non-Repeating Character
 * <p>
 * Write a function that takes in a string of lowercase English-alphabet letters and returns the index of the string's first non-repeating character.
 * <p>
 * The first non-repeating character is the first character in a string that occurs only once.
 * If the input string does not have any non-repeating characters, your function should return -1.
 * <p>
 * Sample Input: "abcdcaf"
 * Sample Output: 1 -> The first non-repeating character is "b" and is found at index 1.
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("abcdcaf"));
    }

    public static int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();
        for (char c : string.toCharArray()) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        int counter = 0;
        for (char c : string.toCharArray()) {
            if (characterCountMap.get(c) == 1) {
                return counter;
            }
            counter++;
        }
        return -1;
    }
}
