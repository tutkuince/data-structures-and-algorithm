package io.tince.algorithm.sort.basic.insertion.exercise;

import java.util.Arrays;

public class InsertionSort {
    // WRITE INSERTION SORT METHOD HERE//
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public static void insertionSort(int[] myArray) {
        for (int i = 1; i < myArray.length; i++) {
            int j = i - 1;
            int temp = myArray[i];
            while (j > -1 && temp < myArray[j]) {
                myArray[j + 1] = myArray[j];
                myArray[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {

        int[] myArray = {4, 2, 6, 5, 1, 3};

        insertionSort(myArray);

        System.out.println(Arrays.toString(myArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */
    }
}
