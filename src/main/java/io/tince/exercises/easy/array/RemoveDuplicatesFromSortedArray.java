package io.tince.exercises.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array "nums" sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. The return the number of unique elements in "nums".
 * <p>
 * Consider the number of unique elements of "nums" to be "k", to get accepted, you need to do the following things:
 * - Change the array "nums" such that the first "k" elements of "nums" contain the unique elements in the order they were present in "nums"
 * initially. The remaining elements of "nums" are not important as well as the size of "nums".
 * - Return k.
 * <p>
 * Example 1:
 * Input: nums = [1, 1, 2]
 * Output: 2, nums = [1, 2, _]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Example 2:
 * Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
 * Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3 and 4.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] numbers1 = {1, 1, 2};                         // [1, 2, 2]
        int[] numbers2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};    // [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
        System.out.println(removeDuplicates2(numbers1));
    }

    // Solution - 1
    public static int removeDuplicates(int[] nums) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int i : nums) {
            if (!uniqueNumbers.contains(i)) {
                uniqueNumbers.add(i);
            }
        }
        for (int i = 0; i < uniqueNumbers.size(); i++) {
            nums[i] = uniqueNumbers.get(i);
        }
        return uniqueNumbers.size();
    }

    // Solution - 2
    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
