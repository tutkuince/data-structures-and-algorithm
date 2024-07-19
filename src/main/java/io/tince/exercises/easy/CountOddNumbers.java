package io.tince.exercises.easy;

/**
 * Count Odd Numbers in an Interval Range
 * <p>
 * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
 * <p>
 * Example 1:
 * Input: low = 3, high = 7
 * Output: 3
 * Explanation: The odd numbers between 3 and 7 are [3,5,7].
 * <p>
 * Example 2:
 * Input: low = 8, high = 10
 * Output: 1
 * Explanation: The odd numbers between 8 and 10 are [9].
 */
public class CountOddNumbers {
    public static void main(String[] args) {
        System.out.println(new CountOddNumbers().countOdds(8, 10));
    }

    public int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        return (high - low) / 2 + count;
    }

}
