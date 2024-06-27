package Amazon;

/**
 * In an given array, find the sub array that has the maximum sum and print the sum
 * For eg [-2,1,-3,4,-1,2,1,-5,4] has subarray [4,-1,2,1] whose sum is 6
 * Also return the sub array that constitutes this sum
 */
public class largestSuminSubArray2 {

    public int[] MaxSubArray(int [] nums){
        if(nums==null || nums.length==0) return new int[0];

        int prev = nums[0];
        int max = prev;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i=1;i<nums.length;i++){
            if(prev < 0){
                prev = nums[i];
                tempStart = i;
            }else {
                prev+=nums[i];
            }
            if(prev > max){
                max = prev;
                start = tempStart;
                end = i;
            }
        }

        int [] result = new int[end-start+1];
        for(int i=start;i<=end;i++){
            result[i-start] = nums[i];
        }
        System.out.println("Maximum sum subarray: " + max);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        largestSuminSubArray2 msm = new largestSuminSubArray2();
        int[] result = msm.MaxSubArray(arr);

        System.out.print("Elements of the subarray with the maximum sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
