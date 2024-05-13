package io.tince._10hashtables.hashset.interview.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove Duplicates
 *
 * You are given a list of integers, "myList", where some of the elements may be repeated.
 * Your task is to write a Java method that removes all duplicate elements from the list and returns a new list containing only the unique elements.
 *
 * The method signature should be as follows: public static List<Integer> removeDuplicates(List<Integer> myList);
 *
 * */
public class RemoveDuplicates {

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */

    }
}
