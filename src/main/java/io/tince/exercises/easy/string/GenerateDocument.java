package io.tince.exercises.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Generate Document
 *
 * You are given a string of available characters and a string representing a document that you need to generate.
 * Write a function that determines if you can generate the document using the available characters.
 * If you can generate the document, your function should return true; otherwise, it should return false.
 *
 * YTou are only able to generate the document if the frequency of unique characters in the characters string is greater than or
 * equal to the frequency of unique characters in the document string. For example, if you're given characters = "abcabc" and document = "aabbccc"
 * you cannot generate the document because you're missing one c.
 *
 * The document that you need to create may contain any characters, including special characters, capital letters, numbers, and spaces.
 * Note: you can always generate the empty string ("")
 *
 * Sample Input: chracters = "Bste!hetsi ogEAxpelrt x", document = "AlgoExpert is the Best!"
 * Sample Output: true
 * */
public class GenerateDocument {
    public static void main(String[] args) {
        generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!");
    }

    public static boolean generateDocument(String characters, String document) {
        // Write your code here.
        // TODO
        char[] charactersCharArray = characters.toCharArray();
        char[] documentCharArray = document.toCharArray();
        Map<Character, Integer> characterCountMap = new HashMap<>();
        Map<Character, Integer> documentCharacterCountMap = new HashMap<>();

        for (char c : charactersCharArray) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : documentCharArray) {
            documentCharacterCountMap.put(c, documentCharacterCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : characterCountMap.keySet()) {
            if (characterCountMap.get(c).intValue() != documentCharacterCountMap.get(c).intValue()) {
                return false;
            }
        }

        return false;
    }
}
