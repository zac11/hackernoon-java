package Amazon;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * String input : "Hi my name is ABCD"
 * String output : "iH ym eman si DCBA"
 */
public class reverseCharactersInString {

    // Approach 1 without using any default method
    public static String reverseApproach1(String str){
        if(str == null || str.isEmpty()){
            return str;
        }

        String [] tokens = str.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(String string1 : tokens){
            sb.append(reverseString(string1)+" ");
        }
        return sb.substring(0,sb.length()-1);
    }

    public static String reverseString(String input){
        if(input == null || input.isEmpty()) return input;
        char [] charArr = input.toCharArray();
        for(int i=0;i<charArr.length/2;i++){
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length-1-i];
            charArr[charArr.length-1-i] = temp;
        }
        return new String(charArr);
    }

    public static String reverseApproach2(String str){
        // Approach 2 using Streams
        return Arrays.stream(str.split(" "))
                .map(reverseCharactersInString :: reverseString)
                .collect(Collectors.joining(" "));
    }

    public static void main(String [] args){
        System.out.println(reverseApproach1("Welcome to Java"));
        System.out.println(reverseApproach2("Hi my name is ABCD"));
    }
}
