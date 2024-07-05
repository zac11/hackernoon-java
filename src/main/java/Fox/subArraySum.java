package Fox;

import java.util.HashMap;
import java.util.Map;

/**
 * Asked in Fox SDET-II Interview Round -1
 * If there is an array [arr], find all the sub-arrays whose sum equals an integer K
 * e.g - [1,2,1,3], k=4 -> [1,3],[1,2,1]
 *
 */
public class subArraySum {

    public int subArray(int [] arr, int k){
        int count = 0;
        int totalSum = 0;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int num : arr){
            totalSum+= num;
            if(mp.containsKey(totalSum-k)){
                count+= mp.get(totalSum-k);
            }
            mp.put(totalSum,mp.getOrDefault(totalSum,0)+1);
        }

        return count;

    }
    public static void main(String [] args){
        subArraySum solution = new subArraySum();
        int[] nums1 = {1,2,1,3};
        int k1 = 4;
        System.out.println(solution.subArray(nums1, k1));

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(solution.subArray(nums2, k2));
    }
}
