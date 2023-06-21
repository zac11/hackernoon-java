package Arrays;

import java.util.HashSet;

public class firstRepeatingElementinArray {

    /**
     * Given an array arr, find the first repeating element from that array
     */

    public static int getFirstRepeatedElement(int [] arr){
        HashSet<Integer> hs = new HashSet<>();

        for(int num: arr){
            if(hs.contains(num)){
                return num;
            }
            hs.add(num);
        }

        return -1; // for no repeating element
    }

    public static void main(String [] args){
        int [] arr = {1,2,4,7,6,8,6,7,2};
        int repeatedNum = getFirstRepeatedElement(arr);

        if(repeatedNum!=-1){
            System.out.println("Repeated number is-->"+repeatedNum);
        }
        else{
            System.out.println("No repeated number found");
        }
    }
}
