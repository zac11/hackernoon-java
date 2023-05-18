package Strings;

import java.util.HashSet;

public class removeDuplicateAlphabets {

    // given a string, remove the duplicate characters and print the result
    public static String removeDuplicates(String str){
        StringBuilder output = new StringBuilder();
        HashSet<Character> has = new HashSet<>();

        for(char c : str.toCharArray()){
            if(!has.contains(c)){
                output.append(c);
                has.add(c);
            }
        }

        return output.toString();
    }

    public static void main(String [] args){
        String input = "Remove the dupplicatess";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}
