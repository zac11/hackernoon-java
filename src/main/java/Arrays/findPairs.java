package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findPairs {

    /**
     * Given an array find those pairs whose sum is equal to n
     * @param arr
     * @param sum
     */

    public static void findPairs(int [] arr, int sum){
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int complement = sum - arr[i];
            if(s.contains(complement)){
                System.out.println("Pair found: "+arr[i]+ ","+complement);

            }
            s.add(arr[i]);
        }
    }

    public static void findPairsusingHashmap(int [] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (map.containsKey(complement)) {
                int count = map.get(complement);
                System.out.println("Pair found: " + arr[i] + "," + complement + " (Count: " + count + ")");
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

    }

    public static void main(String [] args){
        int [] arr = {3, 4, 1, 2, 5, 7, 8};
        int sum = 9;

        findPairs(arr,sum);
        findPairsusingHashmap(arr,sum);
    }
}
