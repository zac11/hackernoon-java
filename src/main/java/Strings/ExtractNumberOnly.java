package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumberOnly {

    public static String extractNumber(String input){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            return matcher.group();
        }else{
            return "No number found";
        }
    }
    public static void main(String [] args){
        System.out.println(extractNumber("JavaLearning2024")); // Output: 2024
        System.out.println(extractNumber("Version1.5"));     // Output: 15
        System.out.println(extractNumber("NoNumbersHere"));
    }
}
