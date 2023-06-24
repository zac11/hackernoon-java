package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateAlphabets {

    // given a string, remove the duplicate characters and print the result
    public static String removeDuplicates(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> seenChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!seenChars.contains(currentChar)) {
                seenChars.add(currentChar);
                result.append(currentChar);
            }
        }

        return result.toString();
    }



    public static void main(String [] args){
        String input = "my name is rahul yadav";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}
