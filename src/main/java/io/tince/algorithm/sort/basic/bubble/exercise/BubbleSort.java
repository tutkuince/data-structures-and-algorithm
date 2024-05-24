package io.tince.algorithm.sort.basic.bubble.exercise;

import java.util.Arrays;

public class BubbleSort {
    // WRITE BUBBLE SORT METHOD HERE//
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public static void bubbleSort(int[] myArray) {
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] myArray = {4, 2};

        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }
}
