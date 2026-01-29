package io.tince.reboot.day03_sliding_window;

/**
 * Best Time to Buy and Sell Stock
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the i th day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Example 1: Input: prices = [7, 1, 5, 3, 6, 4] Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Example 2: Input: prices = [7, 6, 4, 3, 1] Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        System.out.println("Result: " + maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("Result: " + maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    // Approach: Sliding Window (Two Pointers)
    // We maintain two pointers:
    // prev: The day we BUY (should be the lowest price seen so far)
    // current: The day we SELL (current day we are iterating)
    // Time Complexity: O(n) - We pass through the array only once.
    // Space Complexity: O(1) - Only variable storage.
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int prev = 0;
        int current = 1;
        while (current < prices.length) {
            int prevPrice = prices[prev];
            int currentPrice = prices[current];
            if (prevPrice < currentPrice) {
                int currentProfit = currentPrice - prevPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                prev = current;
            }
            current++;
        }
        return maxProfit;
    }
}
