package io.tince.algorithm.sort.merge;

import java.util.Arrays;

public class MergeSort {
    

    // [4, 6, 9] -- [2, 5, 7]
    private static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] > array2[j]) {
                combined[index] = array2[j];
                j++;
            } else {
                combined[index] = array1[i];
                i++;
            }
            index++;
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            i++;
            index++;
        }
        while (j < array2.length) {
            combined[index] = array1[j];
            j++;
            index++;
        }
        return combined;
    }
}
