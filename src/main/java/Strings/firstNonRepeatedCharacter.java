package Strings;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class firstNonRepeatedCharacter {
    /**
     * Given a string s print the first non repeating character
     */

    public static char printFirstNonRepeating(String str){
        LinkedHashMap<Character, Integer> charcount = new LinkedHashMap<>();

        // count freq of each char
        for(char c: str.toCharArray()){
            // check the letter is a character
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                charcount.put(c,charcount.getOrDefault(c,0)+1);
            }
        }

        // Find first non repeating
        for(char c: charcount.keySet()){
            if(charcount.get(c)==1){
                return c;
            }
        }

        return '\0';
    }

    public static void main(String [] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char firstrepeatedchar = printFirstNonRepeating(str);
        System.out.println("First non repeating-->"+firstrepeatedchar);
    }
}
