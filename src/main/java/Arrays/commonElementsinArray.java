package Arrays;

import java.util.HashSet;

public class commonElementsinArray {
    /**
     * Given two arrays arr1 and arr2, find elements that are common in both
     */

    public static void commonElements(int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int n : arr2){
            if(set.contains(n)){
                commonElements.add(n);
            }
        }

        System.out.println("Common elements are"+commonElements);
    }

    public static void main(String [] args){
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };
        commonElements(array1,array2);
    }
}
