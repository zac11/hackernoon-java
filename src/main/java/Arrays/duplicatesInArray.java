package Arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicatesInArray {

    // find duplicates in an array
    public static void findDuplicates(int[] arr){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate element ------>"+ arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
    }

    public static void main(String [] args){
        int[] arr = {2,6,7,3,5,6,8,9,12,54,3,17};
        findDuplicates(arr);
    }
}
