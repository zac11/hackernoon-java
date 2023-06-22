package Arrays;

import java.util.Arrays;

public class sortNamesinArray {
    /**
     * Given an array with names, sort the array by names
     */

    public static void sortNames(String [] names){
        Arrays.sort(names);
    }

    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Eve", "David"};

        System.out.println("Names before sorting:");
        for (String name : names) {
            System.out.println(name);
        }

        sortNames(names);

        System.out.println("Names after sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
