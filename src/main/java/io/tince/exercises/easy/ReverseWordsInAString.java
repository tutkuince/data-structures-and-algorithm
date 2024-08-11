package io.tince.exercises.easy;

/**
 * Reverse Words in a String
 * <p>
 * Given an input string "s", reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in "s" will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * <p>
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * <p>
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords("a good   example"));
        System.out.println(new ReverseWordsInAString().reverseWords("the sky is blue"));
        System.out.println(new ReverseWordsInAString().reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].isEmpty()) {
                result.append(strings[i]);
                if (i != 0) result.append(" ");
            }
        }
        return result.toString();
    }
}
