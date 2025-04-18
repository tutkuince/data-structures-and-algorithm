package io.tince.exercises.easy.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Common Characters
 * <p>
 * Write a function that takes in a non-empty list of non-empty strings and returns a list of characters that are common to all strings in the list,
 * ignoring multiplicity.
 * <p>
 * Note that the strings are not guaranteed to only contain alphanumeric characters. The list you return can be in any order.
 * <p>
 * Sample Input: strings = ["abc", "bcd", "cbaccd"]
 * Sample Output: ["b", "c"]    // the characters could be ordered differently.
 */
public class CommonCharacters {

    public static void main(String[] args) {
        String[] strings = {"abc", "bcd", "cbaccd"};
        System.out.println(Arrays.toString(commonCharacters(strings)));
    }

    public static String[] commonCharacters(String[] strings) {
        // Write your code here.
        Set<Character> common = new HashSet<>();
        for (char c : strings[0].toCharArray()) {
            common.add(c);
        }

        for (int i = 1; i < strings.length; i++) {
            Set<Character> current = new HashSet<>();
            for (char c : strings[i].toCharArray()) {
                current.add(c);
            }
            common.retainAll(current);
        }

        String[] result = new String[common.size()];

        int counter = 0;
        for (char c : common) {
            result[counter] = String.valueOf(c);
            counter++;
        }

        return result;
    }
}
