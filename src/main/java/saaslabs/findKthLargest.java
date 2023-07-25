package saaslabs;

import java.util.Arrays;

public class findKthLargest {
    /**
     * Given an array, find the kth largest element
     */

    public static int findKthLargest(int [] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }


    public static int findKthLargestApproach2(int [] arr, int k){
        if(k<1 || k > arr.length){
            throw new IllegalArgumentException("Invalid Kth value given");
        }
        // divide the array into left and right
        int left = 0;
        int right  = arr.length-1;

        while(true){
            int quickSortPivot = partition(arr, left,right);
            int len = quickSortPivot - left + 1;

            if(len == k){
                return arr[quickSortPivot];
            } else if (len > k) {
                right = quickSortPivot - 1;
            }else {
                k-= len;
                left = quickSortPivot+1;
            }
        }
    }

    public static int partition(int [] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;

        for(int j= left;j < right;j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr,i+1, right);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String [] args){
        System.out.println("Printing the kth largest element");
        int [] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int kthLargestValue = findKthLargest(arr, k);
        int kthLargestValueWithApproach2 = findKthLargestApproach2(arr, k);
        System.out.println("Kth largest value --> "+kthLargestValue);
        System.out.println("Kth largest value --> "+kthLargestValueWithApproach2);
    }
}
