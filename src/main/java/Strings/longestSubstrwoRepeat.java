package Strings;

import java.util.HashSet;
import java.util.Set;

public class longestSubstrwoRepeat {

    /**
     * Given a string str, find the longest substring without repeatition
     */

    public static String longestNonRepeatingSubstr(String str){
        if(str==null || str.isEmpty()){
            return "";
        }
        int len = str.length();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int maxStart = 0;

        Set<Character> st = new HashSet<>();

        while(end < len){
            char current = str.charAt(end);
            if(st.contains(current)){
                st.add(current);
                int currentLength = end-start+1;

                if(currentLength > maxLen){
                    maxLen = currentLength;
                    maxStart = start;
                }
                end++;
            }else{
                st.remove(str.charAt(start));
                start++;
            }
        }

        return str.substring(maxStart,maxStart+maxLen);
    }

    public static void main(String [] args){
        String str = "abcabcbb";

        String longestSubstring = longestNonRepeatingSubstr(str);

        System.out.println("Longest substring without repetition: " + longestSubstring);
    }
}
