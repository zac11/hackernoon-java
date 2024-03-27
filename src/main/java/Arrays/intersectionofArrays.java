package Arrays;
import java.util.Arrays;


public class intersectionofArrays {

    /**
     * Given two arrays find the intersection of the two arrays
     *
     */

    public static int[] intersectionpoint(int [] arr1, int[] arr2){

       int[] smallerArray = (arr1.length <= arr2.length) ? arr1 : arr2;
        int[] largerArray = (arr1.length > arr2.length) ? arr1 : arr2;

        int [] tempResult = new int[smallerArray.length];
        int index = 0;

        for (int num : smallerArray) {
            if (contains(num, largerArray)) {
                // To avoid adding duplicates from the smaller array to the result
                if (!contains(num, Arrays.copyOf(tempResult, index))) {
                    tempResult[index++] = num;
                }
            }
        }

        return Arrays.copyOf(tempResult,index);

    };
    public static boolean contains(int num, int [] arr){
        for(int element : arr){
            if(element == num){
                return true;
            }
        }

        return false;

    }

    public static void main(String [] args){
        int [] arr1 = {1,4,6,7,8};
        int [] arr2 = {4,6,8,9,6,8};

        int [] intersect = intersectionpoint(arr1,arr2);

        System.out.println("Intersection printing");

        for(int num : intersect){
            System.out.println("Intersection printing numbers "+num);
        }

    }
}
