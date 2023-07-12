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

    public static String removeVowels_Approach3(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String [] args){
        String str = "Use this string";
        String result = removeVowels_Approach1(str);
        System.out.println(result);

        String newresult = removeVowels_Approach1(str);
        System.out.println(newresult);

        String newresult2 = removeVowels_Approach3(str);
        System.out.println(newresult2);
    }

}
