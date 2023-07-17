package iris;

import java.util.Arrays;
import java.util.List;

public class reverseText {

    public static void main(String[] args) {
        String input = "Welcome to Java";
        System.out.println(reverseStringWithSpaces(input));
    }

    public static String reverseStringWithSpaces(String str) {
        char[] originalStrChars = str.toCharArray();
        char[] reversedStrChars = new char[str.length()];

        // Mark spaces in reversed string
        for (int i = 0; i < str.length(); i++) {
            if (originalStrChars[i] == ' ') {
                reversedStrChars[i] = ' ';
            }
        }

        // Fill characters in reversed string
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            // Skip if the current character is space
            if (originalStrChars[i] != ' ') {
                // Skip spaces in reversed string
                while (reversedStrChars[j] == ' ') {
                    j--;
                }
                // Fill character
                reversedStrChars[j] = originalStrChars[i];
                j--;
            }
        }

        return new String(reversedStrChars);
    }

}
