package Strings;

public class checkStringisPanagram {
    /**
     * A panagram is a string that contains all the 26 characters of English alphabet
     * Given a string input, find if that string is a panagram
     */

    public static boolean isPanagram(String str){
        boolean [] letters = new boolean[26];

        // convert string to lowercase
        str = str.toLowerCase();

        //iterate throw each character
        for( char c: str.toCharArray()){
            if(Character.isLetter(c)){
                letters[c-'a'] = true;
            }
        }

        for(boolean isPresent: letters){
            if(!isPresent){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";

        if (isPanagram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
