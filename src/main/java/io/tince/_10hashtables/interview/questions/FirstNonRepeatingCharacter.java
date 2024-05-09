package io.tince._10hashtables.interview.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * First Non-Repeating Character
 *
 * You have been given a string of lowercase letters.
 *
 * Write a function called "firstNonRepeatingChar(String)" that finds the first non-repeating character in the given string using a hash table (HashMap).
 * If there is no non-repeating character in the string, the function should return "null".
 *
 * For example, if the input string is "leetcode", the function should return "I" because "I" is the first character that appears only once in the string.
 * Similarly, if the input string is "hello", the function should return "h" because "h" is the first non-repeating character in the string.
 *
 * */
public class FirstNonRepeatingCharacter {

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    //                                         //
    //                                         //
    //                                         //
    //                                         //
    /////////////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

    public static Character firstNonRepeatingChar(String value) {
        Map<Character, Integer> resultMap = new HashMap<>();
        for (char c : value.toCharArray()) {
            resultMap.put(c, resultMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (resultMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
