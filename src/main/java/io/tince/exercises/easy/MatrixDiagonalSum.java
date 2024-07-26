package io.tince.exercises.easy;

/**
 * Matrix Diagonal Sum
 * <p>
 * Given a square matrix "mat", return the sum of the matrix diagonals.
 * <p>
 * Only include the sum of all elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 * <p>
 * Example 1:
 * Input: mat =
 * [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 * <p>
 * Example 2:
 * Input: mat =
 * [[1,1,1,1],
 * [1,1,1,1],
 * [1,1,1,1],
 * [1,1,1,1]]
 * Output: 8
 * <p>
 * Example 3:
 * Input: mat = [[5]]
 * Output: 5
 * <p>
 * [[7,3,1,9],
 * [3,4,6,9],
 * [6,9,6,6],
 * [9,5,8,5]]
 */
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] mat3 = new int[][]{{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}};
        int[][] mat4 = new int[][]{{5}};
        System.out.println(new MatrixDiagonalSum().diagonalSum(mat3));
    }

    // Brute Force
    public int diagonalSum(int[][] mat) {
        int result = 0;
        boolean isNecessary = mat.length % 2 != 0;
        int midPoint = mat.length / 2;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
                result += mat[i][j];
                if (isNecessary && j == midPoint) mat[i][j] = 0;
                break;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat[i].length - 1 - i; j >= 0; j--) {
                int number = mat[i][j];
                result += mat[i][j];
                break;
            }
        }
        return result;
    }
}
