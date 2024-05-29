package io.tince.dynamic.programming;

public class BottomUpFibonacci {
    public static void main(String[] args) {
        int n = 40;
        System.out.println("\nFib of " + n + " = " + fib(n));
    }

    public static int fib(int n) {
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;
        for (int index = 2; index <= n; index++) {
            fibList[index] = fibList[index - 1] + fibList[index - 2];
        }
        return fibList[n];
    }
}
