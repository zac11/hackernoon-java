package maths;

import java.util.Scanner;

public class armStrongNumber {
    /**
     * An Armstrong number is a number that is equal to the sum of the cubes of its own digits.
     * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
     *
     * Given a number, find if its an armstrong number
     */

    public static boolean isArmStrong(int number){
        int orgNumber = number;
        int sum= 0;
        while (number!=0){
            int digit = number%10;
            sum+=Math.pow(digit,3);
            number/= 10;
        }

        return orgNumber == sum;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Entered number is a armstrong ---->"+isArmStrong(number));
    }
}
