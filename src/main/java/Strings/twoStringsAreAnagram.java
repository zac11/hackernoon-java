package Strings;

import java.util.Arrays;

public class twoStringsAreAnagram {

    // given two strings, find out if they are anagram of each other
    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        // convert both strings to character array
        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
