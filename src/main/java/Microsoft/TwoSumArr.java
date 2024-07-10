package Microsoft;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class TwoSumArr {
    public int [] twoSumProblem(int [] arr, int target){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp = target - arr[i];
            if(mp.containsKey(comp)){
                return new int[]{mp.get(comp),i};
            }
            mp.put(arr[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumArr solution = new TwoSumArr();
        int[] nums = {2,7,11,15};
        int target = 18;

        int[] result = solution.twoSumProblem(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
