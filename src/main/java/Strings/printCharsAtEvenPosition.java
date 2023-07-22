package Strings;

public class printCharsAtEvenPosition {
    /**
     * Given a string, print only those characters that are at even positions
     */

    public static void printEvenCharacters(String str) {
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        printEvenCharacters(str);
    }
}
