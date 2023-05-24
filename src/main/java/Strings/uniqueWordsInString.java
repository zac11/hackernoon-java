package Strings;

import java.util.HashSet;

public class uniqueWordsInString {

    // give a string find all the unique words in it
    /***
     *  For input string ""Are you sleeping brother john? Are you hungover?" it should output
     *  are
     *  you
     *  sleeping
     *  brother
     *  john
     *  hungover
     *
     */

    public static void findUniqueWords(String str){
         // split the word
        String [] words = str.split(" ");

        // store the unique words in a set
        HashSet<String> uniquewords = new HashSet<>();

        for(String s: words){
            uniquewords.add(s.toLowerCase());
        }

        for(String unique : uniquewords){
            System.out.println(unique);
        }

    }

    public static void main(String [] args){
        String inputString = "Are you sleeping brother john? Are you hungover?";
        findUniqueWords(inputString);
    }
}
