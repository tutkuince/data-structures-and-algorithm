package io.tince._13array;

import java.util.Arrays;

/**
 * Array: Rotate
 *
 * You are tasked with implementing a method, rotate, that rotates an array to the right by k steps, where k is a non-negative integer.
 *
 * Method Signature: public static void rotate(int[] nums, int k)
 *
 * This method takes as input an array of integers "nums" and a non-negative integer "k", and rotates the array in-place.
 *
 * Input
 *  - An array of integer "nums" ( you can assume the array is not empty )
 *  - A non-negative integer "k", which represents the number of steps the array should be rotated.
 *
 * Output: This function does not return anything. It modifies the input array "nums" in-place to rotate it to the right by "k" steps.
 * */
public class Rotate {
    // WRITE THE ROTATE METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public static void rotate(int[] nums, int k) {
        // TODO
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"

        int[] nums3 = {1, 2};
        int k3 = 3;
        rotate(nums3, k3);
        System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

        int[] nums4 = {1};
        int k4 = 0;
        rotate(nums4, k4);
        System.out.println("Test case 4: Rotated array: " + Arrays.toString(nums4));  // prints "Rotated array: [1]"

        int[] nums5 = {1, 2, 3, 4, 5, 6};
        int k5 = 6;
        rotate(nums5, k5);
        System.out.println("Test case 5: Rotated array: " + Arrays.toString(nums5));  // prints "Rotated array: [1, 2, 3, 4, 5, 6]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Rotated array: [5, 6, 7, 1, 2, 3, 4]
            Test case 2: Rotated array: [3, 99, -1, -100]
            Test case 3: Rotated array: [2, 1]
            Test case 4: Rotated array: [1]
            Test case 5: Rotated array: [1, 2, 3, 4, 5, 6]
        */

    }
}
