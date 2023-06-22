package Strings;

public class countNoOfVowels {

    /**
     * Given a string str, count the number of vowels
     */

    public static int countofVowels(String str){
        int count = 0;
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++){
           char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = countofVowels(input);

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
