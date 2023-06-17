package Arrays;

public class moveNegNumbersToStart {

    /**
     * Given an array move the negative numbers to start of an array
     */
    static void moveNegativeNumbers(int [] arr){
        int left = 0;
        int right = arr.length -1;

        while( left<= right){
            // both elements are negative, move to next pair
            if(arr[left]< 0 && arr[right] < 0){
                left++;
            } else if (arr[left] >=0 && arr[right]< 0) {
                // left element is positive and left element is negative,
                // then swap and move to next pair
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                
            } else if (arr[left] >= 0 && arr[right] >= 0) {
                // both elements are positive, move to next pair
                right --;
                
            }else{
                // left element is negative and right element is positive,
                // move to next pair
                left++;
                right--;
            }
        }
    }

    public static void main(String [] args){
        int [] arr = {2, -5, 8, -3, 1, -9, 4};
        moveNegativeNumbers(arr);

        for(int num: arr){
            System.out.println(num+ " ");
        }
    }

}
