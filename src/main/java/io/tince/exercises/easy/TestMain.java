package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        // int[] blocks = new int[] {1, 5, 7, 4};
        // int[] blocks = new int[] {2, 6, 6, 3, 7};
        int[] blocks = new int[] {2, 2};
        System.out.println(solution(blocks));
    }

    public static int solution(int[] blocks) {
        // [1, 5, 7, 4]
        // [2, 6, 6, 3, 7]
        // [2, 2]
        int[] possibleSmallest = Arrays.copyOf(blocks, blocks.length);
        Arrays.sort(possibleSmallest);

        List<Integer> blocksList = Arrays.stream(blocks).boxed().toList();
        int firstTryIndex = blocksList.indexOf(possibleSmallest[0]);
        int secondTryIndex = blocksList.indexOf(possibleSmallest[1]);
        int result1 = tries(blocksList, firstTryIndex);
        int result2 = tries(blocksList, secondTryIndex);
        return Math.max(result1, result2);
    }

    public static int tries(List<Integer> blocksList, int index) {
        /*int goLeft = 1;
        int goRight = 1;
        if (index == blocksList.size()) {
            goRight = 0;
        }
        if (index == 0) {
            goLeft = 0;
        }*/
        int land = 1;
        for (int i = index; i < blocksList.size() - 1; i++) {
            if (blocksList.get(i) <= blocksList.get(i + 1)) {
                land++;
            } else {
                break;
            }

        }
        for (int i = index; 0 < i; i--) {
            if (blocksList.get(i) <= blocksList.get(i - 1)) {
                land++;
            } else {
                break;
            }
        }
        return land;
    }
}
