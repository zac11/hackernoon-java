package Arrays;

import java.util.Arrays;

public class maxMinDifferenceArray {
    /***
     * Given an array arr, find the max and min difference between elements
     *
     */
// Solution taken from https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

    static int maxDiff(int [] arr, int n){
        /**
         * The function assumes that there
         * are at least two elements in array.
         * The function returns a negative
         * value if the array is sorted in
         * decreasing order and returns 0 if
         * elements are equal
         */
        int diff = arr[1] - arr[0];
        int curr_sum = diff;
        int max_sum  = curr_sum;

        for(int i=1;i<n-1;i++){
            // calculate current difference
            diff = arr[i+1] - arr[i];

            // calculate current sum
            if(curr_sum > 0){
                curr_sum+=diff;

            }else{
                curr_sum = diff;
            }

            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }

        }
        return  max_sum;
    }


    public static void main(String [] args){
        int [] arr = {5, 8, 12, 3, 1, 9, 4};
       int n = arr.length;

        System.out.print("Maximum difference is " +maxDiff(arr, n));
    }
}
