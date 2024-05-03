package io.tince._07stack.interview.questions;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Stack: Sort Stack
 * The "sortStack" method takes a single argument, a "Stack" object.
 * The method should sort the elements in the stack in ascending order (the lowest value will be at the top of the stack) using only one additional stack.
 * The function should use the "pop", "push", "peek" and isEmpty methods of the "Stack" object.
 *
 * To sort the stack, you should create a new, empty stack to hold the sorted elements.
 * Then, while the original stack is not empty, you should remove the top element from the original stack and compare it to the top element of the sorted stack.
 * If the top element of the sorted stack is greater than the current element, you should move the top element of the sorted stack back to the original stack
 * until the current element is in the correct position.
 * Finally, you should add the current element to the sorted stack.
 *
 * Once all the elements have been sorted, you should copy the sorted elements from the sorted stack to the original stack in the correct order.
 *
 * Overall, the function should have a time complexity of O(n^2), where n is the number of elements in the original stack,
 * due to the nested loops used to compare the elements.
 * However, the function should only use one additional stack, which could be useful in situations where memory is limited.
 *
 * */
public class SortStack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    // WRITE THE SORT STACK METHOD HERE//
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public static void sortStack(SortStack<Integer> stack) {
        SortStack<Integer> additionalStack = new SortStack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }


    public static void main(String[] args) {
        SortStack<Integer> stack = new SortStack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

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
        return stackList.isEmpty();
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

}
