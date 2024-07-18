package io.tince.exercises.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Baseball Game
 * <p>
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * <p>
 * An integer x.
 * Record a new score of x.
 * '+'.
 * - Record a new score that is the sum of the previous two scores.
 * 'D'.
 * - Record a new score that is the double of the previous score.
 * 'C'.
 * - Invalidate the previous score, removing it from the record.
 * <p>
 * Return the sum of all the scores on the record after applying all the operations.
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 * <p>
 * Example 1:
 * Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "2" - Add 2 to the record, record is now [5, 2].
 * "C" - Invalidate and remove the previous score, record is now [5].
 * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
 * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
 * The total sum is 5 + 10 + 15 = 30.
 */
public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        String[] ops2 = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        String[] ops3 = new String[]{"1", "C"};
        System.out.println(new BaseballGame().calPoints(ops3));
    }

    public int calPoints(String[] operations) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : operations) {
            if (str.equals("+")) {
                int lastIndexValue = numbers.get(numbers.size() - 1);
                int lastButOneValue = numbers.get(numbers.size() - 2);
                int result = lastIndexValue + lastButOneValue;
                numbers.add(result);
            } else if (str.equals("D")) {
                int lastIndexValue = numbers.get(numbers.size() - 1) * 2;
                numbers.add(lastIndexValue);
            } else if (str.equals("C")) {
                if (!numbers.isEmpty()) numbers.remove(numbers.size() - 1);
            } else {
                numbers.add(Integer.parseInt(str));
            }
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int calPoints2(String[] operations) {
        int[] scores = new int[operations.length];
        int size = 0;

        for (String op : operations) {
            if (op.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            } else if (op.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            } else if (op.equals("C")) {
                size--;
            } else {
                scores[size] = Integer.parseInt(op);
                size++;
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }

        return sum;
    }
}
