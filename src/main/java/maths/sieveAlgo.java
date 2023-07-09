package maths;

import java.util.Arrays;
import java.util.Scanner;

public class sieveAlgo {

    /**
     * Implementation of Sieve Algorithm to find prime numbers upto N
     */

    public static void main(String [] args){
        System.out.println("Enter the range to find prime numbers");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        boolean isPrime [] = sieveAlgo(range);
       for(int i=0;i<=range;i++){
           System.out.println(i+"  is prime "+isPrime[i]);
       }

    }

    static boolean[] sieveAlgo(int n){
        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<=n;i++){
            for(int j=2;j<=n;j+=i){
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
