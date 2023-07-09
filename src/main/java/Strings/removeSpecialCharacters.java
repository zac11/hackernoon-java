package Strings;

public class removeSpecialCharacters {

    /***
     * Given a string str, remove special characters
     */

    public static void removeSpecialChars(String str){
        String outputString = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("String after removing the special characters --->"+outputString);
    }


    public static void main(String [] args){
        String input = "#@He;$ is m#y frien##nd";
        removeSpecialChars(input);
    }
}
