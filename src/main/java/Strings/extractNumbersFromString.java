package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractNumbersFromString {

    public static void extractNumbers(String input){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String number = matcher.group();
            System.out.println(number);
        }
    }

    public static String  extractNumbers_Approach2(String input){
        input = input.replaceAll("[^0-9]"," ");
        input = input.replaceAll(" +"," ");

        if(input.equals("")){
            return "-1";
        }

        return input;
    }

    public static void main(String [] args){
        String input = "geeksforgeeks A-118, Sector-136, Uttar Pradesh-201305";
        extractNumbers(input);
        System.out.print(extractNumbers_Approach2(input));
    }
}
