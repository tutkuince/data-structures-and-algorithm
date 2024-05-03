package io.tince._07stack.interview.questions;

import java.util.ArrayList;

/**
 * Stack: Reverse String
 *
 * The "reverseString" method takes a single parameter "String", which is the string you want to reverse.
 *
 * Return a new "String" with the letters in reverse order.
 *
 * This method will be written in the same class as the main method so it will be "static".
 *
 * */
public class ReverseString <T> {

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
    }

    private static String reverseString(String myString) {
        StringBuilder reversedString = new StringBuilder();
        ReverseString<Character> stack = new ReverseString<>();
        for (Character c : myString.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    private ArrayList<T> stackList = new ArrayList<>();

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

    // WRITE POP METHOD HERE //
    //                       //
    //                       //
    //                       //
    ///////////////////////////
    public T pop() {
        if (stackList.isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }
}
