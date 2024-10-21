package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * Ransom Note
 * <p>
 * Given two strings "ransomNote" and "magazine", return 'true' if "ransomNote" can be constructed by using the letters from "magazine" and 'false' otherwise.
 * <p>
 * Each letter in "magazine" can only be used once in "ransomNote".
 * <p>
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * <p>
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * <p>
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(solution("CBACD"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        // TODO: Implement Solution
        return false;
    }


    public static String solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();

                // Check for 'AB' or 'CD' pairs and pop if found
                if ((top == 'A' && ch == 'B') || (top == 'C' && ch == 'D')) {
                    stack.pop();  // Pair found, pop the top of the stack
                }
            } else {
                stack.push(ch);  // Stack is empty, push the current character
            }
        }

        // Convert the remaining characters in the stack back to a string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
