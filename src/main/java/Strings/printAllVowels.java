package Strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class printAllVowels {

    // given a string print all the vowels

    public static void printAllvowels(String str){
        String all_vowels = Pattern.compile("[aeiouAEIOU]")
                .matcher(str)
                .results()
                .map(match -> match.group())
                .collect(Collectors.joining());

        System.out.println("All vowels are --->"+all_vowels);
    }

    public static void main(String [] args){
        String str = "Testing is beautiful";
        printAllvowels(str);
    }
}
