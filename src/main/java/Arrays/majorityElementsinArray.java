package Arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityElementsinArray {
    /**
     * Given an array arr, find the majority elements that appear for more than n/2 times,
     * where n is the size of array
     */

    public static List<Integer> findMajorityElements(int [] arr){

        List<Integer> majorityElements = new ArrayList<>();

        // Step 1: Find potential majority elements using Moore's Voting Algorithm
        int candidate1 = 0, count1 = 0;
        int candidate2 = 0, count2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify potential majority elements
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > arr.length / 3) {
            majorityElements.add(candidate1);
        }

        if (count2 > arr.length / 3) {
            majorityElements.add(candidate2);
        }

        return majorityElements;

    }

    public static void main(String [] args){
        int[] nums = {3, 2, 3, 1, 2, 2, 3, 3, 4, 4, 4};

        List<Integer> majorityElements = findMajorityElements(nums);

        if (majorityElements.isEmpty()) {
            System.out.println("No majority elements found.");
        } else {
            System.out.println("Majority elements:");
            for (int element : majorityElements) {
                System.out.println(element);
            }
        }
        }
    }

