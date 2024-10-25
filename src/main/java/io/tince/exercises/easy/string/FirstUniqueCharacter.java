package io.tince.exercises.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * First Unique Character in a String
 * <p>
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation: The character 'l' at index 0 is the first character that does not occur at any other index.
 * <p>
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar2("leetcode"));
        System.out.println(firstUniqChar2("loveleetcode"));
        System.out.println(firstUniqChar2("aabb"));
    }

    public static int firstUniqChar2(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = arr[i];
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar(String s) {
        Map<Character, Chars> charsMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        int index = Integer.MAX_VALUE;
        boolean isUpdated = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charsMap.get(charArray[i]) == null) {
                charsMap.put(charArray[i], new Chars(i, 1, true));
            } else {
                Chars chars = charsMap.get(charArray[i]);
                chars.count += 1;
                chars.isUnique = false;
                charsMap.put(charArray[i], chars);
            }
        }
        for (Character c : charsMap.keySet()) {
            Chars chars = charsMap.get(c);
            if (chars.isUnique && chars.index < index) {
                index = chars.index;
                isUpdated = true;
            }
        }
        return isUpdated ? index : -1;
    }

    public static class Chars {
        public int index;
        public int count;
        public boolean isUnique;

        public Chars(int index, int count, boolean isUnique) {
            this.index = index;
            this.count = count;
            this.isUnique = isUnique;
        }
    }
}
