package io.tince.exercises.medium.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Move Element To End
 * You're given an array of integers and an integer. Write a function that moves all instances of that integer in the array
 * to the end of the array and returns the array.
 *
 * The function should perform this in place(i.e. it should mutate the input array) and doesn't need to maintain the order of the other integers.
 *
 * Sample Input: array = [2, 1, 2, 2, 2, 3, 4, 2], toMove = 2
 * Sample Output: [1, 3, 4, 2, 2, 2, 2, 2]  // the numbers 1, 3, and 4 could be ordered differently.
 *
 * */
public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> array = List.of(2, 1, 2, 2, 2, 3, 4, 2);
        System.out.println(moveElementToEnd(array, 2));
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (Integer integer : array) {
            if (integer == toMove) {
                counter++;
            } else {
                result.add(integer);
            }
        }
        for (int i = array.size() - counter; i < array.size(); i++) {
            result.add(toMove);
        }
        return result;
    }
}
