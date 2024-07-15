package io.tince.exercises.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * <p>
 * There are six instances where subtraction is used:
 * - I can be placed before V (5) and X (10) to make 4 and 9.
 * - X can be placed before L (50) and C (100) to make 40 and 90.
 * - C can be placed before D (500) and M (1000) to make 400 and 900.
 * <p>
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * <p>
 * Example 2:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * Example 3:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("III"));
        System.out.println(new RomanToInteger().romanToInt("LVIII"));
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        Map<Character, Integer> charIntValueMap = new HashMap<>();
        charIntValueMap.put('I', 1);
        charIntValueMap.put('V', 5);
        charIntValueMap.put('X', 10);
        charIntValueMap.put('L', 50);
        charIntValueMap.put('C', 100);
        charIntValueMap.put('D', 500);
        charIntValueMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && charIntValueMap.get(s.charAt(i)) < charIntValueMap.get(s.charAt(i + 1))) {
                result -= charIntValueMap.get(s.charAt(i));
            } else {
                result += charIntValueMap.get(s.charAt(i));
            }
        }
        return result;
    }
}
