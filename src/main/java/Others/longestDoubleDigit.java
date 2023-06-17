package Others;

import java.util.Scanner;

/**
 * Write a java code to determine the longest double digit number from a whole number.
 * For eg - if the input is 453857, then the output should be 85
 */
public class longestDoubleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int max = 0;
        while (number > 0) {
            int temp = number % 100;
            if (temp > max) {
                max = temp;
            }
            number /= 10;
        }
        System.out.println("The largest double digit number is " + max);
    }
}


