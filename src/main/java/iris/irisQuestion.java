package iris;

import java.util.HashMap;

public class irisQuestion {

    /**
     * Asked in IRIS Round -1 . Find the count of each element from this array
     * @param args
     */


    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,6,5,3,2,9,9,9};

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int element: arr){
            if(hmap.containsKey(element)){
                int count = hmap.get(element);
                hmap.put(element,count+1);
            }
            else{
                hmap.put(element,1);
            }
        }

        for(int element : hmap.keySet()){
            int count = hmap.get(element);
            System.out.println("Element "+element+" occurs "+count+" times in this array");
        }
    }
}
