package io.tince._13array;

import java.util.Arrays;

/**
 * Array: Find Max Min
 * <p>
 * In this problem, you are given an array of integers, and the tasks is to write a method that finds the maximum and minimum numbers in the array.
 * <p>
 * The method should return these two numbers as an array with the maximum number at the first index and the minimum number at the second index.
 * <p>
 * Method Signature: public static int[] findMaxMin(int[] myList)
 */
public class FindMaxMin {

    //WRITE THE FIND MAX MIN METHOD HERE//
    //                                  //
    //                                  //
    //                                  //
    //                                  //
    //////////////////////////////////////
    public static int[] findMaxMin(int[] myList) {
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        // 5, 3, 8, 1, 6, 9
        for (int num : myList) {
            if (num > tempMax) {
                tempMax = num;
            }
            if (num < tempMin) {
                tempMin = num;
            }
        }
        return new int[]{tempMax, tempMin};
    }


    public static void main(String[] args) {

        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

        int[] myList2 = {-5, -3, -8, -1, -6, -9};
        int[] result2 = findMaxMin(myList2);
        System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

        int[] myList3 = {0, 0, 0, 0, 0};
        int[] result3 = findMaxMin(myList3);
        System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

        int[] myList4 = {100, 200, 300, 400, 500};
        int[] result4 = findMaxMin(myList4);
        System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: MaxMin: [9, 1]
            Test case 2: MaxMin: [-1, -9]
            Test case 3: MaxMin: [0, 0]
            Test case 4: MaxMin: [500, 100]
        */

    }
}
