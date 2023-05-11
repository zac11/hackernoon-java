package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstnonrepeating {

    public static void firstNonRepeating(String str){
        LinkedHashMap<Character, Integer> charFreq = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c,0)+1);
        }
        char firstNonRepeating = '\0';

        for(Map.Entry<Character, Integer> entry : charFreq.entrySet()){
            if(entry.getValue() == 1){
                firstNonRepeating = entry.getKey();
                break;
            }
        }

        System.out.println("First non-repeating character: " + firstNonRepeating);
    }

    public static void main(String [] args){
        String str = "xxyyzzqxxyyzz";
        firstNonRepeating(str);
    }
}
