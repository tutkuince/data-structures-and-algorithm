package io.tince.exercises.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Lemonade Change
 * <p>
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills).
 * Each customer will only buy one lemonade and pay with either a $5, $10, $20 bill.
 * You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
 * <p>
 * Note that you do not have any change in hand at first.
 * <p>
 * Given an integer array bills where bills[i] is the bill the i^th customer pays, return true if you can provide every customer with the correct change, or false otherwise.
 * <p>
 * Example 1:
 * Input: bills = [5,5,5,10,20]
 * Output: true
 * Explanation:
 * From the first 3 customers, we collect three $5 bills in order.
 * From the fourth customer, we collect a $10 bill and give back a $5.
 * From the fifth customer, we give a $10 bill and a $5 bill.
 * Since all customers got correct change, we output true.
 * <p>
 * Example 2:
 * Input: bills = [5,5,10,10,20]
 * Output: false
 * Explanation:
 * From the first two customers in order, we collect two $5 bills.
 * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
 * For the last customer, we can not give the change of $15 back because we only have two $10 bills.
 * Since not every customer received the correct change, the answer is false.
 */
public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
        System.out.println(new LemonadeChange().lemonadeChange(bills));
    }

    public boolean lemonadeChange(int[] bills) {
        int dollar5 = 0;
        int dollar10 = 0;
        for (int i : bills) {
            if (i == 5) dollar5++;
            else if (i == 10) {
                dollar10++;
                if (dollar5 >= 1) dollar5--;
                else return false;
            } else {
                if (dollar5 >= 1 && dollar10 >= 1) {
                    dollar5--;
                    dollar10--;
                } else if (dollar5 >= 3) dollar5 -= 3;
                else return false;
            }
        }
        return true;
    }
}
