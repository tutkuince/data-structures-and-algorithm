package io.tince.exercises.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Min Stack
 * <p>
 * Design a stack that supports push, pop, top and retrieving the minimum element in constant time.
 * <p>
 * Implement MinStack class:
 * - MinStack() initializes the stack object.
 * - void push(int val) pushes the element "val" onto the stack
 * - void pop() removes the element on the top of the stack
 * - int top() gets the top element of the stack.
 * - int getMin() retrieves the minimum element in the stack
 * <p>
 * You must implement a solution with O(1) time complexity for each function
 * <p>
 * Example 1:
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 */
public class MinStack {
    Deque<Pair> stack;
    public MinStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int val) {
        Pair pair = new Pair();
        pair.val = val;
        int prevMin = !stack.isEmpty() ? stack.getLast().min : Integer.MAX_VALUE;
        pair.min = Math.min(pair.val, prevMin);
        stack.add(pair);
    }

    public void pop() {
        stack.removeLast();
    }

    public int top() {
        return stack.getLast().val;
    }

    public int getMin() {
        return stack.getLast().min;
    }

    class Pair {
        int val;
        int min;
    }
}
