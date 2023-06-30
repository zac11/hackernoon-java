package concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * Example to show the concept of Hashmap, Hashtable, Hashset
 */

public class hmhths {
    public static void main(String [] args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");

        System.out.println(hashMap);    // Output: {1=One, 2=Two, 3=Three}
        System.out.println(hashtable);  // Output: {3=Three, 2=Two, 1=One}
        System.out.println(hashSet);
    }




}
