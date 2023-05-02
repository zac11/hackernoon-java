package Arrays;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void removeDuplicates(int [] arr){
        Set<Integer> st = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
               st.add(arr[i]);
            }else {
                arr[i] = 0;
            }
        }
        // convert back to array
        int [ ] result  = new int[st.size()];
        int i = 0;
        for (int num:
             st) {
            result[i++] = num;
        }

        // Print the new array
        System.out.print("New Array without Duplicates: ");
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }

    public static void main(String [] args){
        int [] arr = {2,4,5,7,6,4,6,12,11,13,12,7};
        removeDuplicates(arr);
    }


}
