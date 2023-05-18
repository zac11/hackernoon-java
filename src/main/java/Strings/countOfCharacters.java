package Strings;

import java.util.HashMap;
import java.util.Map;

public class countOfCharacters {
     // show the count of characters in a given string

    public static void countOfChars(String str){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            // get the character at ith position
            char c = str.charAt(i);
            if(mp.containsKey(c)){
                int count  = mp.get(c);
                mp.put(c,count+1);
            }else{
                mp.put(c,1);
            }


        }
        for(Map.Entry<Character, Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String [] args){
        String str = "This is a counting string";
        countOfChars(str);
    }
}
