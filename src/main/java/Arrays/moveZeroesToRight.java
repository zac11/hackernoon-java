package Arrays;

public class moveZeroesToRight {

    /***
     * Given an array of 0's and 1's , move all the 0's to the right
     */

    public static void moveZeroesToRight(int [] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 1 && left < right) {
                left++;
            }

            if (arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            right--;
        }
    }

    public static void main(String [] args){
        int [] arr = {1, 0, 0, 1, 0, 1, 1};
        moveZeroesToRight(arr);


        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
