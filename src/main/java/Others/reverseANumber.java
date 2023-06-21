package Others;

public class reverseANumber {
    /**
     * Given a number, reverse the number
     * eg - 12345 should become 54321
     */

    public static int reverseNumber(int number){
        int reversedNumber = 0;

        while (number!=0){
            int digit = number%10;
            reversedNumber = reversedNumber*10+digit;
            number/=10;
        }

        return reversedNumber;
    }

    public static void main(String [] args){
        int num = 12345;
        int reversedNum = reverseNumber(num);

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversedNum);
    }
}
