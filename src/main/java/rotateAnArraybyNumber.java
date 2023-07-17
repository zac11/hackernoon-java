import java.util.Arrays;

public class rotateAnArraybyNumber {
    /**
     * Given an array arr,rotate the array to the right by a given number of steps using java
     */

    public static void rotateMethod(int  [] arr, int index){
        index = index % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,index-1);
        reverse(arr,index,arr.length-1);

    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }
    }

    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateMethod(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
