package Arrays;

public class PrintAlternateNumber {
    public static void printAlternate(int [] arr){
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //
    }

    public static void main(String [] args){
        int[] arr1 = {3, 1, 5, 7, 8, 1};
        System.out.print("Input: {3, 1, 5, 7, 8, 1} => Output: ");
        printAlternate(arr1);

        int[] arr2 = {10, 25, 33, 48, 51};
        System.out.print("Input: {10, 25, 33, 48, 51} => Output: ");
        printAlternate(arr2);

        int[] arr3 = {99};
        System.out.print("Input: {99} => Output: ");
        printAlternate(arr3);
    }
}
