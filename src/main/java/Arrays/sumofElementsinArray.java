package Arrays;

public class sumofElementsinArray {
    /**
     * Given an array arr, find the sum of the elements in the array
     */

    public static int sumofArray(int [] arr){
        int sum= 0;
        for (int num : arr){
            sum+=num;
        }

        return sum;
    }

    public static void main(String [] args){
        int [] arr = {5, 2, 8, 3, 1, 9, 7, 4};
        int sum = sumofArray(arr);

        System.out.println("Total is ----> "+sum);
    }
}
