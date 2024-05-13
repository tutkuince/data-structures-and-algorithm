package io.tince._10hashtables.hashset.interview.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Has Unique Chars
 *
 * Write a Java program to determine if a given string contains all unique characters or not.
 *
 * Implement a method called "hasUniqueChars" that takes a single argument, a string, and returns a boolean value.
 *
 * The method should return "true" if all characters in the input string are unique and false if there are any duplicate characters
 *
 * Method signature: public static boolean hasUniqueChars(String string)
 *
 * */
public class HasUniqueChars {

    // WRITE HASUNIQUECHARS METHOD HERE //
    //                                  //
    //                                  //
    //                                  //
    //                                  //
    //////////////////////////////////////
    public static boolean hasUniqueChars(String value) {
        Set<Character> characterSet = new HashSet<>();
        boolean result = true;
        for (char c : value.toCharArray()) {
            if (!characterSet.add(c)) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }
}
