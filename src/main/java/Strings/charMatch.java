package Strings;

import java.lang.String;

public class charMatch {
    /***
     * Given two strings,string1 and string2,select only the characters in each string
     * where the character in the same position in the other string
     * is in uppercase. Return these as a single string using java
     *
     * e.g.,if string1 =“heLLo” and string2 = “GUlp”, Output would be “help”
     *
     * This was asked in Round 1 for Auto Zone Round -1
     * @param str1
     * @param str2
     * @return
     */
    public static String selectUppercaseChars(String str1, String str2){
        //StringBuilder result = new StringBuilder();
        StringBuilder newresult = new StringBuilder();

        int minlength = str1.length()+ str2.length();
        int maxLength  = Math.max(str1.length(), str2.length());
//
        for(int i=0;i<maxLength;i++){
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if(Character.isUpperCase(char2)){
                newresult.append(char1);
            }

        }

        for(int j=0;j<maxLength;j++){
            char char1 = str1.charAt(j);
            char char2 = str2.charAt(j);
            if(Character.isUpperCase(char1)){
                newresult.append(char2);
            }
        }

//        for(int i=0;i<minlength;i++){
//            char firstchar = str1.charAt(i);
//            char secondChar = str2.charAt(i);
//            if(Character.isUpperCase(secondChar)){
//                    newresult.append(firstchar);
//            } else if (Character.isUpperCase(secondChar)) {
//                newresult.append(secondChar);
//            }
//        }
        return  newresult.toString();
    }

    public static void main(String [] args){
        String selectedChars = selectUppercaseChars("“heLLo”", "“GUlp”");
        System.out.println(selectedChars);
    }
}
