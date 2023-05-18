package Strings;

public class reverseStringRecursion {

    public static String reverseRecursion(String str){
         // if string is blank and only one character
        if(str.isBlank() || str.length()==1){
            return str;
        }
        return reverseRecursion(str.substring(1))+str.charAt(0);
    }

    public static void main(String [] args){
        String original = "HeLLo GUlp";
        String reversed = reverseRecursion(original);

        System.out.println("Original ----> "+original);
        System.out.println("Reversed ----->"+reversed);
    }
}
