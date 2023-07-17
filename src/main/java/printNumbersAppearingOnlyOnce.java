import java.util.HashMap;
import java.util.Map;

public class printNumbersAppearingOnlyOnce {

    /**
     * Given an array arr, print only those entries which appear only 1 time in array
     */

    public static void printOnlyOnceAppearing(int [] arr){
        Map<Integer, Integer> count = new HashMap<>();

        for( int i : arr){
            count.put(i, count.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String [] args){
        int [] arr = {1,2,4,4,6,7,8,3,3,6,7,9};
        printOnlyOnceAppearing(arr);
    }
}
