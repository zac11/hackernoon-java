package Arrays;

import java.util.Arrays;

public class duplicatesWoLibrary {
    /**
     * Given an array arr, find the duplicates without using any library function
     * @param arr
     * @return arr
     */
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int uniqueIndex = 0;
        boolean isDuplicate;

        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        int[] resultArr = new int[uniqueIndex];
        System.arraycopy(uniqueArr, 0, resultArr, 0, uniqueIndex);
        return resultArr;
    }

    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 7, 8};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }
}
