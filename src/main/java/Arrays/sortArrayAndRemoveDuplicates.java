package Arrays;

import java.util.Arrays;

public class sortArrayAndRemoveDuplicates {
    /**
     * Given an array arr, sort the array and remove duplicates
     */

    public static int[] sortedandremovedDupes(int [] arr){
        // first sort the array
        Arrays.sort(arr);
        // remove the duplicates
        int len = arr.length;
        int [] result = new int[len];
        int j = 0;
        for (int i=0;i< len-1;i++){
            if(arr[i]==arr[i+1]){
                result[j]=arr[i];
                j++;
            }
        }
        result[j]= arr[len-1];

        // Create new array
        return Arrays.copyOf(result, j+1);
    }
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 2, 9, 1, 5, 10, 8 };

        int[] sortedArray = sortedandremovedDupes(arr);

        System.out.println("Sorted array without duplicates: " + Arrays.toString(sortedArray));
    }
}
