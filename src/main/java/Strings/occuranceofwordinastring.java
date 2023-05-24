package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occuranceofwordinastring {
    // given a string find how many times a particular word is appearing in this string

    public static int countofwordoccurance(String str, String word){
        // split the string into array of words
        String [] words = str.split("\\s+");

        // get a hashmap to store the frequency of each word
        Map<String, Integer> mp = new HashMap<>();

        for(String s: words){
            mp.put(s, mp.getOrDefault(s,0)+1);
        }

        return mp.getOrDefault(word,0);

    }

    public static void occurrenceOfCharInStr(String str) {
        int occurrence = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to find: ");
        char toFind = scanner.next().charAt(0);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (toFind == charArray[i]) {
                occurrence++;
            }
        }
        System.out.println("Character "+toFind+" presence " +occurrence+ " times");
    }

    public static void main(String [] args){
        String text = "Lorem Ipsum dolor sit amet consectetur adipiscing elit ipsum";
        String word = "ipsum";

        int count = countofwordoccurance(text, word);
        System.out.println("Occurrences of '" + word + "': " + count);

        occurrenceOfCharInStr(text);
    }
}
