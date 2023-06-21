package Others;

import java.util.Scanner;

public class digitsInANumber {

    /**
     * Given a number N, calculate the number of digits in the number
     */

    public static int calculateDigits(int number){
        int count = 0;
        if(number ==0){
            return 1;
        }
        while(number!=0){
            number/=10;
            count++;
        }

        return count;

    }

    public static void main(String [] args){
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("Number of digits in "+number+" is "+calculateDigits(number));
    }
}
