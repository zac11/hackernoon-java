package Youtube;

/**
 * The question asked in Round 1 of Youtube SDET interview - The interviewer explained Moore's voting algo and
 * wanted to approach the problem wrt Java code.
 *
 * Moores Voting Algorithm is used to find the majority element from a group
 */
public class MooreAlgo {
    public static Integer findMajorityElementinArray(int [] nums){
        // Initialise the first element as the majority element
        int majorityEle = nums[0];

        // Give the first majority element a vote count of 1
        int voteCount = 1;

        // Traverse the array and vote on the majority element
        for (int i=1;i<nums.length;i++){
            // if the element is equal to the majority element, then increase the count
            if(nums[i]==majorityEle){
                voteCount++;
            }else{
                voteCount--;
                if(voteCount==0){
                    //if vote count becomes 0 then make the ith element as majority element
                    majorityEle=nums[i];
                    voteCount=1;
                }
            }
        }

        // verify that the majority element is indeed a majority element. If the element is > then [n/2], then it is
        // a majority element

        int count = 0;
        for (int n : nums){
            if(n ==majorityEle){
                count++;
            }
        }
        if(count > nums.length / 2){
            return majorityEle;
        }else{
            return null; // return null in case of no majority element
        }
    }
    public static void main(String [] args){
        int [] nums = {2,3,2,1,3,2,2,5,7}; // there is no majority element in this array
        Integer result = findMajorityElementinArray(nums);
        if(result!=null){
            System.out.println("Majority element is ====>"+result);
        }else{
            System.out.println("Majority element not found");
        }

        int [] nums1 = {1,1,1,1,2,3,5};
        Integer result1 = findMajorityElementinArray(nums1);
        if(result1!=null){
            System.out.println("Majority element is ====>"+result1);
        }else{
            System.out.println("Majority element not found");
        }
    }

}
