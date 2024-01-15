package maths;

public class checkPalindromNumber {

    /**
     * Given a number check if it is a palindrome
     * eg - 12321 is a palindrome number
     */

    public static boolean isPalin(int number){
        if(number < 0){
            return false; // negative numbers cant be palindrome
        }
        int origNo = number;
        int reversedNo = 0;

        while (number!=0){
            int digit = number%10;
            reversedNo = reversedNo*10+digit;
            number/=10;
        }
        return origNo == reversedNo;
    }

    public static void main(String [] args){
        int firstNo = 1234321;
        int secondNo = 12345;

        System.out.println("Is first no palindrome-->"+isPalin(firstNo));
        System.out.println("Is second no palindrome--->"+isPalin(secondNo));
    }
}
