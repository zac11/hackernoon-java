package Others;

import java.util.Scanner;

public class factorialOfNumber {
    /**
     * Given a number N, calculate the factorial of that number
     */

    public static int factorial(int number){
        if(number==0 || number==1){
            return number;
        }
        else{
            int fact =1;
            for(int i=2;i<=number;i++){
                fact*=i;
            }
            return fact;
        }
    }

    public static void main(String [] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        System.out.println("Number is -->"+no+"and factorial is-->"+factorial(no));
    }
}
