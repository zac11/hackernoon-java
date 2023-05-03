package Arrays;

import java.util.Arrays;

public class quickSortArray {

    public static void quickSort(int [] arr, int left, int right){
        if(left < right){
            int pivotIndex = partition(arr, left,right);
            System.out.println(Arrays.toString(arr));
            quickSort(arr, left, pivotIndex-1);
            quickSort(arr, pivotIndex+1, right);
        }

    }

    public static int partition(int [] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for(int j=left;j< right;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }


    public static void main(String [] args){
        int[] arr = {5, 2, 7, 3, 9, 1, 4, 6, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
