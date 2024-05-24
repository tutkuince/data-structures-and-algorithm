package io.tince.algorithm.sort.basic.selection.exercise;

import java.util.Arrays;

public class SelectionSort {
    // WRITE SELECTION SORT METHOD HERE//
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public static void selectionSort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = myArray[i];
                myArray[i] = myArray[minIndex];
                myArray[minIndex] = temp;
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4, 2, 6, 5, 1, 3};

        selectionSort(myArray);

        System.out.println(Arrays.toString(myArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }
}
