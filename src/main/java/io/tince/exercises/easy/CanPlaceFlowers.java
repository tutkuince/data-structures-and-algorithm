package io.tince.exercises.easy;

/**
 * Can Place Flowers
 * <p>
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array "flowerbed" containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and "false" otherwise.
 * <p>
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * <p>
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = new int[]{0, 0, 0, 1};
        int[] flowerbed2 = new int[]{1, 0, 0, 0, 1};
        int[] flowerbed3 = new int[]{1, 0, 0, 0, 0, 1};
        int[] flowerbed4 = new int[]{0, 0, 1, 0, 1};
        int[] flowerbed5 = new int[]{0, 0, 0, 0, 1};
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(flowerbed5, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // TODO
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty.
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty.
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                    if (count == n) return true;
                }
            }
        }
        return count >= n;
    }
}
