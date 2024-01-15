package maths;

import java.util.Scanner;

public class strongNumber {
    // Given an integer find out if it's a Strong number
    // A strong number is that number whose sum of factorial digits is equal to the number itself
    /**
     *  145 is a strong number = 1! + 4! + 5! = 145
     */

    public static void main(String [] args){
        System.out.println("Enter number ----->");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(findStrongNum(number)){
            System.out.println (number + " is Strong Number");
        }else{
            System.out.println (number + " is not a Strong Number");
        }

    }
    static int factorialcalc(int num){
        if(num==0)
            return 1;
        return num * factorialcalc(num-1);
    }

    static boolean findStrongNum(int num){
        int digit, sum=0;
        int temp = num;

        while(temp!= 0){
            digit = temp%10;
            sum = sum+factorialcalc(digit);
            temp/=10;
        }

        return sum == num;
    }
}
