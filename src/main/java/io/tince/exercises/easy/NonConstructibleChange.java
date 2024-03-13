package io.tince.exercises.easy;

// Non-Constructible Change
// Given an array of positive integers representing the values of coins in your possession,
// write a function that returns the minimum amount of change (the minimum sum of money) that you cannot create.
// The given coins can have any positive integer value and aren't necessarily uniques(i.e., you can have multiple coins of the same value).

import java.util.Arrays;

// For example, if you're given "coins = [1, 2, 5]", the minimum amount of change that you can't create is "4". If you're given no coins,
// the minimum amount of change that you can't create is "1".
public class NonConstructibleChange {
    public static void main(String[] args) {
        // Sample Input
        int[] coins = new int[]{5, 7, 1, 1, 2, 3, 22};
        // Sample Output = 20
        System.out.println(nonConstructibleChange(coins));
    }

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        // [1, 1, 2, 3, 5, 7, 22]
        Arrays.sort(coins);
        int change = 0;
        for (int coin : coins) {
            if (coin > change + 1)
                return change + 1;
            change += coin;
        }
        return change + 1;
    }
}
