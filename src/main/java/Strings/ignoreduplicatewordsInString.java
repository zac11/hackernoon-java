package Strings;

import java.util.HashMap;
import java.util.Map;

public class ignoreduplicatewordsInString {

    // given a string print only the unique words in the string
    /***
     *  For input string ""Are you sleeping brother john? Are you hungover?" it should output
     *  sleeping
     *  brother
     *  john?
     *  hungover?
     *
     */

    public static void printOnlyUniqueWords(String str){

        // split the string into words
        String [] outputword = str.split(" ");

        // store occurances of each word in a Map

        Map<String, Integer> map = new HashMap<>();


        // count frequency of each words
        for(String word : outputword){
            String lowercaseString  = word.toLowerCase();
            map.put(lowercaseString, map.getOrDefault(lowercaseString, 0)+1);
        }

        // print the words that appear all at once

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String [] args){
        String inputString = "Are you sleeping brother john? Are you hungover?";
        printOnlyUniqueWords(inputString);
    }
}
