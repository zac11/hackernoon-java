package Arrays;

public class missing_integer {

    //find single missing integer from a set of [1...100]
    public static int findMissingNumber(int [] arr){
        int xor_result = 0;
        for(int i=0;i<arr.length;i++){
            xor_result ^= arr[i];

        }
        for(int i=1;i<=100;i++){
            xor_result ^=i;
        }

        return xor_result;
    }


}



