package Bhaskar;

import java.util.*;

/***
 * Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.
 *
 * // Example 1:
 *
 * // Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 * // Output: "apple"
 */
public class Bhaskar {
    public String findLongestWord(String str, List<String> dict){
        List<String> mutableDictionary = new ArrayList<>(dict);
        Collections.sort(mutableDictionary, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.length() !=t1.length()){
                    return t1.length() - s.length();
                }else{
                    return s.compareTo(t1);
                }
            }
        });
        for(String word:mutableDictionary){
            if(isSubSequence(str,word)){
                return word;
            }
        }
        return "";
    }

    private boolean isSubSequence(String s, String word){
        int i = 0, j = 0;
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }

    public static void main(String [] args){
        Bhaskar bsk = new Bhaskar();
        List<String> dictionary = List.of("ale","apple","monkey","plea");
        String s = "abpcplea";
        System.out.println(bsk.findLongestWord(s, dictionary));
    }

}
