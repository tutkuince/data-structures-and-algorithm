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
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(flowerbed, 1));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // TODO
        return false;
    }
}
