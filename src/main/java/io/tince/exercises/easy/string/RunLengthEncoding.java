package io.tince.exercises.easy.string;

/**
 * Run-Length Encoding
 * <p>
 * Write a function that takes in a non-empty string and returns its run-length encoding.
 * <p>
 * From Wikipedia, "run-length encoding is a form of lossless data compression in which runs of data are stored as a single data value
 * and count, rather than as the original run." For this problem, a run of data is any sequence of consecutive, identical characters.
 * So the run "AAA" would be run-length-encoded as "3A".
 * <p>
 * To make thins more complicated, however, the input string can contain all sorts of special characters, including numbers.
 * And since encoded data must be decodable, this means that we can't naively run-length-encode long runs.
 * For example, the run "AAAAAAAAAAAA" (12As), can't naively be encoded as "12A", since this can be decoded as either "AAAAAAAAAAAA" or "1AA".
 * Thus, long runs (runs of 10 or more characters) should be encoded in a split fashion; the aforementioned run should be encoded as "9A3A".
 * <p>
 * Sample Input: "AAAAAAAAAAAAABBCCCCDD"
 * Sample Output: "9A4A2B4C2D"
 */
public class RunLengthEncoding {

    public static void main(String[] args) {
         System.out.println(runLengthEncoding2("AAAAAAAAAAAA"));
         System.out.println(runLengthEncoding2("AAAAAAAAAAAAABBCCCCDD"));
        System.out.println(runLengthEncoding2("aA"));
        System.out.println(runLengthEncoding2(" "));
    }

    public static String runLengthEncoding(String string) {
        // Write your code here.
        StringBuilder builder = new StringBuilder();
        char firstLetter = string.charAt(0);
        if (string.length() == 1) {
            builder.append(string.length());
            builder.append(firstLetter);
        }
        int counter = 0;
        for (int i = 1; i < string.length(); i++) {
            counter++;
            if (counter % 9 == 0 && firstLetter == string.charAt(i)) {
                builder.append(9);
                builder.append(string.charAt(i));
                counter = 0;
            }

            if (firstLetter != string.charAt(i)) {
                builder.append(counter);
                builder.append(string.charAt(i - 1));
                firstLetter = string.charAt(i);
                counter = 0;
            }

            if (i == string.length() - 1) {
                counter++;
                builder.append(counter);
                builder.append(firstLetter);
            }
        }
        return builder.toString();
    }

    public static String runLengthEncoding2(String string) {
        // Write your code here.
        StringBuilder builder = new StringBuilder();
        char currentChar = string.charAt(0);
        int count = 0;

        for (char c : string.toCharArray()) {
            if (count == 9 || currentChar != c) {
                builder.append(count);
                builder.append(currentChar);
                currentChar = c;
                count = 0;
            }
            count++;
        }

        if (count != 0) {
            builder.append(count);
            builder.append(currentChar);
        }

        return builder.toString();
    }
}
