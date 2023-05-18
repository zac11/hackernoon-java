package Strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class removeConsonants {

    // given a string remove all the consonants from the string

    public static void removeConsonants(String str){
        String without_consonants = Pattern.compile("[aeiouAEIOU\\\\w\\\\d]")
                .matcher(str)
                .results()
                .map(match -> match.group())
                .collect(Collectors.joining());

        System.out.println("String without consonants is ---->"+without_consonants);
    }

    public static void main(String [] args){
       String str = "Here is a string with consonants";
       removeConsonants(str);
    }
}
