package Strings;

import java.util.Scanner;

public class extractLastNCharacters {
    /***
     * Given a string str, extract the last n digits
     *
     */

    public static String extractChars(String str, int index){
        if(str.length()>=index){
            int startIndex = str.length() - index;
            return str.substring(startIndex);

        }else{
            // condition if the string length is less than index
            return str;
        }
    }

    public static void main(String [] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = 2;
        String extractedString = extractChars(str, index);
        System.out.println("Extracted string----> "+ extractedString);
    }
}
