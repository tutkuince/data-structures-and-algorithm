package io.tince.algorithm.recursion;

public class FibonacciSequence {
    static int counter = 0;

    public static void main(String[] args) {
        int n = 7;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter: " + counter);
        // invoked this method 41 times without dynamic programming
    }

    public static int fib(int n) {
        counter++;
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
