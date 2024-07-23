package io.tince.exercises.easy;

/**
 * Check If It Is a Straight Line
 * <p>
 * You are given an array "coordinates", "coordinates[i] = [x, y]", where "[x, y]" represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 * <p>
 * Example 1:
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 * <p>
 * Example 2:
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 */
public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        int[][] coordinates = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(new CheckIfItIsAStraightLine().checkStraightLine(coordinates));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        for (int i = 1; i < coordinates.length; i++) {
            if (xDiff * (coordinates[i][1] - coordinates[0][1]) != yDiff * (coordinates[i][0] - coordinates[0][0]))
                return false;
        }
        return true;
    }
}
