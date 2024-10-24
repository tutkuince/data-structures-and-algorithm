package io.tince.exercises.easy;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decode("aaaabbbb"));
    }

    // E.g encoding "aazzzaaabc" should produce "a2z3a3b1c1"
    private static String decode(String str) {
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        char[] characters = str.toCharArray();
        int counter = 0;
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            if (c != firstLetter) {
                result.append(firstLetter);
                result.append(counter);
                firstLetter = c;
                counter = 1;
            } else {
                counter++;
            }
        }
        result.append(lastLetter);
        result.append(counter);
        return result.toString();
    }
}
