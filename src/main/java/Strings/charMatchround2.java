package Strings;

public class charMatchround2 {

    public static String findCharacters(String string1, String string2) {
        // Create a char array for each string.
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        // Create a new string to store the results.
        String result = "";

        // Iterate over the char arrays.
        for (int i = 0; i < charArray1.length; i++) {
            // If the character in the second char array in uppercase is equal to the character in the first char array, then add it to the result string.
            if (Character.toUpperCase(charArray2[i]) == charArray1[i]) {
                result += charArray1[i];
            }
        }

        // Return the result string.
        return result;
    }

    public static void main(String[] args) {
        // Test cases.
        String string1 = "heLLo";
        String string2 = "GUlp";

        System.out.println(findCharacters(string1, string2)); // Output: help

        string1 = "EVERYTHING";
        string2 = "SomeThings";

        System.out.println(findCharacters(string1, string2)); // Output: EYSomeThings
    }

}
