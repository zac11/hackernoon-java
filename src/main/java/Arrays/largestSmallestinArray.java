package Arrays;

import java.util.Arrays;

public class largestSmallestinArray {

    // find largest and smallest in an ursorted array

    public static void largestSmallest(int [] arr){
        Arrays.sort(arr);

        int len = arr.length;

        System.out.println("Largest element in array ----> "+arr[len-1]);
        System.out.println("Smallest element in array ----> "+arr[0]);

    }


    public static void largestSmallestApproach2(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Largest element in array using second approach ----> "+max);
        System.out.println("Smallest element in array using second approach -----> "+min);
    }


    public static void main(String [] args){
        int [] arr = {199,299,399,9999,7999,8999,99,69999,9999};
        largestSmallest(arr);
        largestSmallestApproach2(arr);
    }
}