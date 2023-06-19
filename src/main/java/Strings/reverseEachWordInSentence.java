package Strings;

public class reverseEachWordInSentence {

    /**
     * Given a sentence of strings, reverse each word in the sentence
     *
     */

    public static String reverseWordsinSentence(String sentence){
        String [] words = sentence.split(" ");
        StringBuilder reverseSentence = new StringBuilder();

        for(String word: words){
            StringBuilder reverseStr = new StringBuilder(word);
            reverseStr.reverse();
            reverseSentence.append(reverseStr).append(" ");
        }

        return reverseSentence.toString().trim();
    }

    public static void main(String [] args){
        String sentence = "Hello world, how are you?";
        String reverse = reverseWordsinSentence(sentence);
        System.out.println("Reversed sentence is--> "+ reverse);
    }


}
