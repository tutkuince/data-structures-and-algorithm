package io.tince.exercises.easy;

/**
 * To Lower Case
 * <p>
 * Given a string "s", return the string after replacing every uppercase letter with the same lowercase letter.
 * <p>
 * Example 1:
 * Input: s = "Hello"
 * Output: "hello"
 * <p>
 * Example 2:
 * Input: s = "here"
 * Output: "here"
 * <p>
 * Example 3:
 * Input: s = "LOVELY"
 * Output: "lovely"
 */
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("Hello"));
        System.out.println(new ToLowerCase().toLowerCase("here"));
        System.out.println(new ToLowerCase().toLowerCase("LOVELY"));
    }
    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
