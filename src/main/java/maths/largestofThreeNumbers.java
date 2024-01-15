package maths;

public class largestofThreeNumbers {
    /**
     * Given three numbers X,Y,Z, find the largest of all of them
     */

    public static int largestNumber(int num1, int num2, int num3){
        int largest = num1;

        if(num2 > largest){
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }

        return largest;
    }

    public static void main(String [] args){
        int num1 = 10;
        int num2 = 5;
        int num3 = 12;

        int largest = largestNumber(num1,num2, num3);

        System.out.println("Largest number ---> "+largest);
    }
}
