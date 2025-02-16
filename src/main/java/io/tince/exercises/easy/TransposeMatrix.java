package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Transpose Matrix
 *
 * You are given a 2D array of integers "matrix". Write a function that returns the transpose of the matrix.
 * The transpose of a matrix is a flipped version of the original matrix across its main diagonal (which runs from top-left to bottom-right);
 * it switches the row and column indices of the original matrix.
 *
 * You can assume the input matrix always has at least 1 value; however its width and height are not necessarily the same.
 *
 * matrix = [
 *  [1, 2],
 * ]
 *
 * [
 *  [1],
 *  [2]
 * ]
 *
 * */
public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix3 = {{1, 2}};
        System.out.println(Arrays.deepToString(transposeMatrix(matrix3)));
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        // Write your code here.
        int height = matrix[0].length;
        int length = matrix.length;
        int[][] result = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
