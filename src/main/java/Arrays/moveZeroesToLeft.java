package Arrays;

public class moveZeroesToLeft {

    /**
     * Given an array of 0's and 1's move all the zeroes to the left
     *
     */
    static void moveZeroes(int [] arr){
        int left = 0;
        int right  = arr.length - 1;
        while(left < right){
            while (arr[right] == 0 && left < right){
                right--;
            }
            if(arr[left]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

            }

            left++;
        }
    }

    public static void main(String [] args){
        int [] arr = {0,0,1,0,0,0,1,1,1,0,1};
        moveZeroes(arr);

        for(int num: arr){
            System.out.print(num+ " ");
        }

    }
}
