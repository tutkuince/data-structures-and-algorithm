package io.tince.exercises.easy;

/**
 * Swap Two Numbers Without Using the Third Variable
 *
 *
 *
 * */
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 25;
        int y = 28;

        System.out.printf("Before Swapping Numbers => X: %s, Y: %s \n", x, y);
        // Swapping
        x = x + y;  // 25 + 28 => x = 53
        y = x - y;  // 53 - 28 => y = 25
        x = x - y;  // 53 - 25 => x = 28

        System.out.printf("After Swapping Numbers => X: %s, Y: %s", x, y);
    }
}
