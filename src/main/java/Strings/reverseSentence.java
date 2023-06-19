package Strings;

public class reverseSentence {
    /**
     * Given a sentence, reverse the sentence ( not every word)
     * e.g - Hello World! --> !World Hello
     */

    public static String reverseSentence(String str){
        String [] wordws = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i=wordws.length-1;i>=0;i--){
            reversedSentence.append(wordws[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String [] args){
        String sentence = "Hello world, how are you?";
        String reversedSentence = reverseSentence(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);

    }
}
