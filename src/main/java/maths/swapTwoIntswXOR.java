package maths;

public class swapTwoIntswXOR {

    /**
     * Use bitwise XOR operation to swap two numbers
     */

    public static void swapWXor(int x, int y){
        System.out.println("Before swapping values are : "+x + " and "+y);
        // code to swap using bitwise XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swapping values are : "+x + " and "+y);
    }

    public static void main(String [] args){
        swapWXor(400,230);
    }
}
