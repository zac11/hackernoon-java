package Search;

public class BinarySearch {

    public static int binarysearch(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left <=right){
            int mid = left + (right - left)/2;

            if(arr[mid]== target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
                
            }else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String [] args){
        int [] sortedArr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        int index = binarysearch(sortedArr, target);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else {
            System.out.println("Element not found in the array.");
        }
    }
}
