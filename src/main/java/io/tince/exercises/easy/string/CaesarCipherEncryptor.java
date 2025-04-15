package io.tince.exercises.easy.string;

/**
 * Caesar Cipher Encryptor
 *
 * Given a non-empty string of lowercase letters and a non-negative integer representing a key,
 * write a function that returns a new string obtained by shifting every letter in the input string by positions in the alphabet, where k is the key.
 *
 * Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a.
 *
 * */
public class CaesarCipherEncryptor {

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("abc", 2));
        System.out.println(caesarCypherEncryptor("xyz", 2));
    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        StringBuilder builder = new StringBuilder();
        int normalizedKey = key % 26;

        for (char c : str.toCharArray()) {
            int ascii = c;
            int shifted = ascii + normalizedKey;
            int minValue = 'a';
            int maxValue = 'z';

            if (shifted > maxValue) {
                int difference = shifted - maxValue;
                int result = difference + minValue - 1;
                builder.append((char) result);
            } else {
                builder.append((char) shifted);
            }
        }
        return builder.toString();
    }
}
