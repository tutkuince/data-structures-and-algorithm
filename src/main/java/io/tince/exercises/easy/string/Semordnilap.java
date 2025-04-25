package io.tince.exercises.easy.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Semordnilap
 * <p>
 * Write a function that takes in a list of uniques strings and returns a list of semordnilap pairs.
 * <p>
 * A semordnilap pair is defined as a set of different strings where the reverse of one word is the same as the forward version of the order.
 * For example the words "diaper" and "repaid" are a semordnilap pair, as are the words "palindromes" and "semordnilap".
 * <p>
 * The order of the returned pairs and the order of the strings within each pair does not matter.
 * <p>
 * Sample Input: words = ["diaper", "abc", "test", "cba", "repaid"]
 * Sample Output: [["diaper", "repaid"], ["abc", "cba"]]
 */
public class Semordnilap {
    public static void main(String[] args) {
        String[] words1 = {"abcdefghijk", "kjihgfedcba"};
        String[] words2 = {"diaper", "abc", "test", "cba", "repaid"};
        System.out.println(semordnilap2(words2));
    }

    public static List<List<String>> semordnilap1(String[] words) {
        // Write your code here.
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                StringBuilder builder = new StringBuilder(words[i]);
                String reveresWord = builder.reverse().toString();
                if (words[j].equals(reveresWord)) {
                    result.add(List.of(words[i], reveresWord));
                }
            }
        }
        return result;
    }

    public static List<List<String>> semordnilap2(String[] words) {
        // Write your code here.
        List<List<String>> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            String reversedWord = builder.reverse().toString();
            if (wordSet.contains(reversedWord)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                list.add(reversedWord);
                result.add(list);
            }
            wordSet.add(word);
        }
        return result;
    }
}
