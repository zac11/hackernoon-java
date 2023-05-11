package Strings;

import java.lang.String;

public class charMatch {
    /***
     * Given two strings,string1 and string2,select only the characters in each string
     * where the character in the same position in the other string
     * is in uppercase. Return these as a single string using java
     *
     * e.g.,if string1 =“heLLo” and string2 = “GUlp”, Output would be “help”
     * @param str1
     * @param str2
     * @return
     */
    public static String selectUppercaseChars(String str1, String str2){
        StringBuilder result = new StringBuilder();

        int minlength = Math.min(str1.length(), str2.length());

        for(int i=0;i<minlength;i++){
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if(Character.isUpperCase(char2)){
                result.append(char1);
            } else if (Character.isUpperCase(char1)) {
                result.append(char2);
                
            }
        }
        return  result.toString();
    }

    public static void main(String [] args){
        String selectedChars = selectUppercaseChars("heLLo", "GUlp");
        System.out.println(selectedChars);
    }
}
