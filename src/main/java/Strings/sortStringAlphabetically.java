package Strings;

import java.util.Arrays;

public class sortStringAlphabetically {

    /**
     * Given a string str, sort the string alphabetically
     */

    public static void sortedString(String str){
        // This approach has a O(n log n) complexity due to use of Arrays.sort() method
       str.toLowerCase();

       char [] chararr = str.toCharArray();

        Arrays.sort(chararr);

        String sorted = new String(chararr);

        System.out.println("Sorted string is -->"+sorted);
    }

    public static void main(String [] args){
        String str = "My name is Rahul";
        sortedString(str);
    }
}
