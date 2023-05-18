package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeVowels {

    // given a string print all the characters apart from vowels

    /*
    * Use first approach where break string into char array
    *
    * */
    public static String removeVowels_Approach1(String str){
            StringBuilder removedword = new StringBuilder();
            String vowels = "aeiouAEIOU";
            for(char c : str.toCharArray()){
                if(vowels.indexOf(c)== -1){
                    removedword.append(c);
                }
            }

            return removedword.toString();
    }

    public static String removeVowels_Approach2(String str){
        String vowelsRegex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(vowelsRegex);
        Matcher matcher = pattern.matcher(str);

        return matcher.replaceAll("");


    }

    public static void main(String [] args){
        String str = "Use this string";
        String result = removeVowels_Approach1(str);
        System.out.println(result);

        String newresult = removeVowels_Approach1(str);
        System.out.println(newresult);
    }

}
