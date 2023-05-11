package Strings;

import java.util.HashMap;
import java.util.Map;

public class duplicatesInString {

   public static void printDupesCount(String str){
        // convert all chars to lowercase and then remove non-alphabetic characters
       str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();


       // Creating a HashMap to store alphabet counts
       Map<Character, Integer> alphabetCountMap = new HashMap<>();
       for(int i=0;i<str.length();i++){
           char c = str.charAt(i);
           alphabetCountMap.put(c,alphabetCountMap.getOrDefault(c,0)+1);
       }

       for (Map.Entry<Character, Integer> entry : alphabetCountMap.entrySet()) {
           char alphabet = entry.getKey();
           int count = entry.getValue();
           System.out.println(alphabet + ": " + count);
       }
    }

    public static void main(String [] args){
        String input = "Hello, World!";
        printDupesCount(input);
    }


}
