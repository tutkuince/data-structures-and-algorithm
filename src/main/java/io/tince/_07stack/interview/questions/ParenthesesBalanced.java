package io.tince._07stack.interview.questions;

import java.util.ArrayList;

/**
 * Parentheses Balanced
 *
 * Check to see if a string of parenthesis is balanced or not.
 *
 * By "balanced", we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order.
 *
 * For example, the string "((()))" has three pairs of balanced parenthesis, so it is a balanced string.
 * On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.
 * Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
 *
 * Your program should take a string of parenthesis as input and return true if it is balanced, or false if it is not.
 * In order to solve this problem, use "Stack" data structure.
 *
 * Method Name: boolean isBalancedParentheses()
 * */
public class ParenthesesBalanced <T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }

    public static boolean isBalancedParentheses(String input) {
        ParenthesesBalanced<Character> stack = new ParenthesesBalanced<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}