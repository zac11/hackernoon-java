package Adobe;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a list of integers and a target sum, write a function to find the indices of the two numbers in the list that add up to the target sum. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * int[] nums = {3, 2, 4}
 * target=6;
 * Output: [1, 2]
 *
 * Shared by Sahil Kapoor on Linkedin ===> https://www.linkedin.com/posts/sahil-kapoor25_sdet-activity-7213582581366235136-YBG0?utm_source=share&utm_medium=member_desktop
 */
public class findIndicesOfParticularSum {

    public static int[] findSumIndices(int [] nums, int target){
        Map<Integer,Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (sumMap.containsKey(complement)) {
                return new int[] { sumMap.get(complement), i };
            }
            sumMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String [] args){
        int[] nums = {3, 2, 4};
        int targetSum = 6;
        int[] result = findSumIndices(nums, targetSum);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        int[] nums2 = {1, 8, 11, 15, 21, 32};
        int target2 = 40;

        int[] result1 = findSumIndices(nums2, target2);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
    }


}
