package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequencyOfWordsinDescOrder {
    /**
     * Given a string str, print the frequency of each word but in descending order
     */

    public static void printCharFrequencyDesc(String str){
        Map<Character,Integer> hs = new HashMap<>();

        // calculate the frequencies
        for(char c: str.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }

        // Create a priority queue to sort the map
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue().compareTo(a.getValue()));

        // Add entries from the frequency map to the priority queue
        pq.addAll(hs.entrySet());

        // print all the frequencies
        while (!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String [] args){
        String str = "Veer is my son";
        printCharFrequencyDesc(str);
    }
}
