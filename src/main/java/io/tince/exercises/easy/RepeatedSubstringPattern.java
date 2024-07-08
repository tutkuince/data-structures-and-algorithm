package io.tince.exercises.easy;

/**
 * Repeated Substring Pattern
 * <p>
 * Given a string "s", check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 * <p>
 * Example 1:
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice
 * <p>
 * Example 2:
 * Input: s = "aba"
 * Output false
 * <p>
 * Example 3:
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 * <p>
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - s consists of lowercase English letters.
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern2("abab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        String substr = "";
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            //valid substring will have this -> (sizeOfString % sizeOfSubString == 0)
            if (n % i == 0) {
                substr = s.substring(0, i);
                if (s.replaceAll(substr, "").isEmpty())
                    return true;
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern2(String s) {
        String str = s + s;
        if (str.substring(1, str.length() - 1).contains(s))
            return true;
        else
            return false;
    }
}
