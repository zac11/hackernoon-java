package maths;

import java.util.Scanner;
import java.util.stream.IntStream;

public class checkNumisPrime {

    /**
     * Given an integer N check if that integer is prime number
     *
     * @return
     */

    public static boolean isPrime(int number){
        if(number < 1){
            return false;
        }

        return IntStream.rangeClosed(2,(int)Math.sqrt(number)).noneMatch(i->number%i ==0);
    }

    public static void main(String [] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPrime(number)){
            System.out.println("This is prime");
        }else {
            System.out.println("This is not prime11");
        }
    }
}
