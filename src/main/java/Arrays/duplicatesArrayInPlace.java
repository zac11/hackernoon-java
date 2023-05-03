package Arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicatesArrayInPlace {
    public static void findDuplicates(int [] arr){
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])){
                System.out.println("Duplicate element found -----> "+arr[i]);
            }else{
                st.add(arr[i]);
            }
        }
    }

    public static void main(String [] args){
        int [] arr = {3,2,4,5,3,4,7,9,1,0,2};
        findDuplicates(arr);
    }
}
