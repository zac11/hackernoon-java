package Strings;

public class countofVowelsInString {
    /**
     * Given a string str, count the number of vowels in it
     */

    public static int countOfVowels(String str){
        int count=0;
        str = str.toLowerCase(); // convert all the string to lowercase
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String [] args){
        String text = "My name is Veer";
        int count = countOfVowels(text);
        System.out.println("Count of vowels is--> "+count);
    }


}
