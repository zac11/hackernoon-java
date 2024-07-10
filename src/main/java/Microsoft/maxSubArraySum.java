package Microsoft;

/**
 * If there is an array [arr],you have to get the sub array with the maximum sum and return the sum
 * arr =[5,4,-1,7,8], sum = 23 , sub array = [5,4,-1,7,8]
 */
public class maxSubArraySum {
    public static int maxArraySum(int [] arr){
        int maxSum = arr[0];
        int maxEndingHere = arr[0];

        for(int i=1;i<arr.length;i++){
            maxEndingHere = Math.max(arr[i],maxEndingHere+arr[i]);
            maxSum = Math.max(maxSum,maxEndingHere);
        }
        return maxSum;
    }

    public static void main(String [] args){
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxArraySum(nums)); // Output: 6
    }
}
