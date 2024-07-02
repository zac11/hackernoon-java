package Adobe;

/**
 * Given an array of integers, write a function to move all the negative numbers to the left end of the array without changing the relative order of the non-negative numbers. The function should do this in place with a minimum number of operations.
 * Example:
 * int[] nums = {1, -1, 3, -2, -3, 5, 6, -7}
 * Output: [-1, -2, -3, -7, 1, 3, 5, 6]
 *
 * Shared by Sahil Kapoor on Linkedin ===> https://www.linkedin.com/posts/sahil-kapoor25_sdet-activity-7213582581366235136-YBG0?utm_source=share&utm_medium=member_desktop
 */
public class moveNegNumbersToLeft {

    public static void moveNegativesToLeft(int [] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                // Shift non-negative numbers to the right
                int j = i;
                while (j > 0 && nums[j - 1] >= 0) {
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[j] = temp;
            }
        }
    }

    public static void main(String [] args){
        int[] nums = {1, -1, 3, -2, -3, 5, 6, -7};
        moveNegativesToLeft(nums);
        for(int num : nums){
            System.out.print(num+ " ");
        }

        System.out.println("\n");

        int[] nums2 = {2, -3, 4, -1, -4, 5, -2, 3};
        moveNegativesToLeft(nums2);
        for(int num : nums2){
            System.out.print(num+ " ");
        }
    }
}
