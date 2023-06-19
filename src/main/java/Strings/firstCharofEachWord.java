package Strings;

public class firstCharofEachWord {
    /**
     * Given a sentence s, find all the first letters of each word in sentence
     * e.g - Hello how are you ---> h,h,a,y
     */

    public static void printFirstChar(String sentence){
        String [] words = sentence.split(" ");
        for(String word : words){
            if(!word.isEmpty()){
                System.out.println(word.charAt(0)+" ");
            }
        }
    }

    public static void main(String [] args){
        String sentence = "Hello world, how are you?";
        System.out.println("First letters: ");
        printFirstChar(sentence);
    }
}
