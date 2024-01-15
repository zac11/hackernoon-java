package maths;

public class swapWithoutThirdVar {
    /**
     * Given two integers x and y, swap their values without using a third variable
     */


    public static void swapIntegers(int x, int y){
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // swap the values
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String [] args){
        int x = 2;
        int y = 3;
        swapIntegers(x,y);
    }
}
