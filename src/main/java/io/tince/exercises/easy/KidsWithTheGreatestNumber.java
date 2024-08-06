package io.tince.exercises.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Kids with the Greatest Number of Candidates
 * <p>
 * There are "n" kids with candies. You are given an integer array "candies", where each "candies[i]" represents the number of candies the "i^th" kid has,
 * and an integer "extraCandies", denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array "result" of length "n", where "result[i]" is "true" if, after giving the i^th kid all the "extraCandies",
 * they will have the greatest number of candies among all the kids, or "false" otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 * <p>
 * Example 1:
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation: If you give all extraCandies to:
 * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
 * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
 * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
 * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 * <p>
 * Example 2:
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false]
 * Explanation: There is only 1 extra candy.
 * Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
 * <p>
 * Example 3:
 * Input: candies = [12,1,12], extraCandies = 10
 * Output: [true,false,true]
 */
public class KidsWithTheGreatestNumber {
    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(new KidsWithTheGreatestNumber().kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int j : candies) {
            if (j > max) max = j;
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            if (candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }

    public List<Boolean> kidsWithCandiesWithStream(int[] candies, int extraCandies) {
        OptionalInt optionalInt = Arrays.stream(candies).max();
        int max = optionalInt.isPresent() ? optionalInt.getAsInt() : 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
