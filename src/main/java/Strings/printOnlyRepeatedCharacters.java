package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class printOnlyRepeatedCharacters {
    /**
     * Given a string str, print only those characters that are repeating and print count of each
     * repeating character

     */
    public static void printRepeatingChars(String str){
        HashMap<Character, Integer> hs = new HashMap<>();

        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                hs.put(c, hs.getOrDefault(c,0)+1);
            }
        }


        System.out.println("Printing all repeated characters");
        for(char c: hs.keySet()){
            if(hs.get(c)> 1){
                System.out.println(c + " - " + hs.get(c));
            }
        }
    }

    public static void main(String [] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printRepeatingChars(str);
    }



}
