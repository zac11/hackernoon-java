package Arrays;

public class reverseArrayInPlace {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap the elements at indices start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Increment start and decrement end
            start++;
            end--;
        }
        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int [] arr = {2,5,12,43,6,76,8,90};
        reverseArray(arr);
    }

}

