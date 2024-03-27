package Search;

public class greaterThanNeigbhour {
    public static int findPeak(int [] nums){
        int n = nums.length;
        if(n==1){
            return 0;
        }
        int left = 0;
        int right = n-1;
        while (left <=right){
            int mid = (left+right)/2;
            if((mid==0 || nums[mid] > nums[mid-1]) &&
                    (mid == n - 1 || nums[mid] > nums[mid + 1])){
                        return mid;
            } else if (mid > 0 && nums[mid]< nums[mid-1]) {
                right = mid-1;
            }else{
                left = mid-1;
            }
        }
        return -1;
    }
    public static void  main(String [] args){
        int [] nums = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = findPeak(nums);
        if(peakIndex!=-1){
            System.out.println("Peak element - Max element is"+nums[peakIndex]+"at index"+peakIndex);
        }else{
            System.out.println("Peak element not found");
        }
    }
}
