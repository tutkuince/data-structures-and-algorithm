package io.tince.exercises.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{([))]}"));
    }
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char digit = s.charAt(i);
            if (brackets.containsKey(digit)) {
                stack.push(digit);
            } else {
                if (stack.isEmpty()) return false;
                char lastOpen = stack.pop();
                if (brackets.get(lastOpen) != digit) return false;
            }
        }
        return stack.isEmpty();
    }
}
