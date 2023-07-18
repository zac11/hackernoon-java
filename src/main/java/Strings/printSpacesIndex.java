package Strings;

import java.util.ArrayList;
import java.util.List;

public class printSpacesIndex {
    /**
     * Given a string, without using any in built method, print indexes where there are spaces
     */

    public static void printSpaceIndex(String str){
        List<Integer> indexes = new ArrayList<>();
        // method to print index of spaces
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                indexes.add(i);
            }
        }
        System.out.println("Indexes"+indexes);
    }

    public static void main(String [] args){
        String str = "My name is Anubha";
        printSpaceIndex(str);
    }
}
