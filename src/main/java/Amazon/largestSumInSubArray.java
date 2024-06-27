package Amazon;

/**
 * In an given array, find the sub array that has the maximum sum and print the sum
 * For eg [-2,1,-3,4,-1,2,1,-5,4] has subarray [4,-1,2,1] whose sum is 6
 */
public class largestSumInSubArray {
    public int MaxSubArray(int [] nums){
        if(nums == null || nums.length==0) return 0;

        int prev = nums[0];
        int max = prev;
        for(int i=1;i<nums.length;i++){
            if(prev<0){
                prev=0;
            }
            prev+=nums[i];
            if (prev > max)max = prev;
        }
        return max;
    }

    public static void main(String [] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        largestSumInSubArray msm = new largestSumInSubArray();
        System.out.println(msm.MaxSubArray(arr));
    }
}
