package maths;

import java.util.Scanner;

public class sumOfDigits {
    /**
     * Given a number N, find the sum of its digits
     */

    public static int calculateSumofDigits(int number){
        int sum = 0;
        while (number!=0){
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }

    public static void main(String [] args){
        System.out.println("Enter number ----->");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Total sum is ---> "+calculateSumofDigits(number));
    }
}
