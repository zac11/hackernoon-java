package Strings;

public class isStringPalindrome {

    // given a string check if it is a palindrome

    public static boolean isPalin(String str){
         // format the string and remove an special character
        String formattedString  = str.replaceAll("[^a-z0-9]","");

        // compare first and last till the middle
        int left = 0;
        int right = formattedString.length()-1;

        while (left < right){
            if(formattedString.charAt(left)!= formattedString.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String [] args){
        String str1 = "NITIN";
        String str2 = "Rahul";

        boolean result1 = isPalin(str1);
        System.out.println("Word is a palindrome ----> "+result1);

        boolean result2 = isPalin(str2);
        System.out.println("Word is a palindrome ----> "+result2);

    }
}
