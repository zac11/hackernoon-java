package Arrays;

import java.util.Arrays;

public class maxProductofNumbers {
    /**
     * Given an array arr, find the two numbers whose product is maximum
     */

    public static void returnMaxNumbers(int [] arr){
        Arrays.sort(arr);

        int maxProduct = arr[arr.length-1] * arr[arr.length-2];

        System.out.println("The numbers whose product is maximum are " + maxProduct);
    }

    public static void returnMaxProduct(int [] arr){
        int maxProduct = 0;
        int secondMaxProduct = 0;

        for(int i =0; i< arr.length; i++){
            int product = arr[i];
            if(maxProduct > maxProduct){
                secondMaxProduct = maxProduct;
                maxProduct = product;
            } else if (product > secondMaxProduct) {
                secondMaxProduct = product;
                
            }
        }

        System.out.println("The numbers whose product is maximum are " + maxProduct + " and " + secondMaxProduct);
    }

    public static void main(String [] args){
        int [] arr = {2,4,8,1,4,10,12,4,16};
        returnMaxNumbers(arr);
        returnMaxProduct(arr);
    }
}
