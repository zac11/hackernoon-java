package maths;

import java.util.Scanner;

public class countEvenOddDigits {
    /**
     * Given a number N, count the number of even,odd digts in N
     */

    public static void countOfEvenOddDigits(int number){
        int evenCount = 0;
        int oddCount = 0;

        while (number!=0){
            int digit = number % 10;
            if(digit%2 ==0){
                evenCount++;
            }else {
                oddCount++;
            }
            number/=10;
        }
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }

    public static void main(String [] args){
        System.out.println("Enter number ---->");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();

        countOfEvenOddDigits(number);
    }
}
