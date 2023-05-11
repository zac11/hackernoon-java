package Strings;

public class charMatchBard {

    public static String selectCharacters(String string1, String string2) {
        // Create a char array to store the selected characters.
        char[] selectedCharacters = new char[Math.min(string1.length(), string2.length())];

        // Iterate through the characters in the two strings, and select the characters where the character in the same position in the other string is in uppercase.
        for (int i = 0; i < selectedCharacters.length; i++) {
            if (Character.isUpperCase(string1.charAt(i)) && Character.isUpperCase(string2.charAt(i))) {
                selectedCharacters[i] = string1.charAt(i);
            }
        }

        // Return the selected characters as a string.
        return new String(selectedCharacters);

    }

    public static void main(String[] args) {
        String string1 = "heLLo";
        String string2 = "GUlp";

        System.out.println(selectCharacters(string1, string2));
    }
}
