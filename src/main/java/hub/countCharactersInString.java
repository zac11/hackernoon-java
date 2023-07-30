package hub;

import java.util.HashMap;
import java.util.Map;

public class countCharactersInString {
    /**
     * Given a string count characters of the string and display it
     * @param args
     */

    public static void main(String [] args){
        String str = "AAAAaaaaaBBBBbbbbbCCCCccccc";
        printCharOccurance(str);


    }

    public static void printCharOccurance(String str){
        Map<Character,Integer> charMap = new HashMap<>();

        str = str.toLowerCase();
        for(char c: str.toCharArray()){
            if(c!=' '){
                charMap.put(c,charMap.getOrDefault(c,0)+1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.println("Character ->"+entry.getKey()+ " appears "+entry.getValue());
        }
    }


}
