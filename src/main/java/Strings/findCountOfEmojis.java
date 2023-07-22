package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findCountOfEmojis {
    /**
     * Given a string str, find the count of emojis in that string
     * e.g. "Hello! How are you :) I am great :D" should print 2 as it has two emojis :) and :D
     */

    public static int returnCountofEmojis(String str){
        String regex = "(:|;)(?:-?[\\)|D])?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        int countofEmojis =0;
        while (matcher.find()){
            countofEmojis++;
        }

        return countofEmojis;
    }

    public static void main(String [] args){
        String str = "Hello! How are you :) I am great :D";
        returnCountofEmojis(str);


    }
}
