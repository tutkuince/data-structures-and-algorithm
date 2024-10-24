package io.tince.exercises.easy.string;

import java.util.Arrays;

/**
 * Reverse String
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p>
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] chars1 = {'h', 'e', 'l', 'l', 'o'};
        char[] chars2 = {'H','a','n','n','a','h'};
        System.out.println(Arrays.toString(chars2));
        reverseString(chars2);
        System.out.println(Arrays.toString(chars2));
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            int index = s.length - 1 - i;
            s[i] = s[index];
            s[index] = temp;
        }
    }
}
