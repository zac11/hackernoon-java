package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sortArrayindescendingOrder {
    /**
     * Given an array arr, sort the array in descending array
     */

    public static void reverseSorted(int [] arr){
        int [] reversed = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(reversed));

    }

    public static void main(String [] args){
        int [] arr = {43,56,78,9,123,54,654};
        reverseSorted(arr);
    }

}
