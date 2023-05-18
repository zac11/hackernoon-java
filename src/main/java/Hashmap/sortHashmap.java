package Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortHashmap {

    public static void main(String [] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("D", 4);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 1);

        // sort the hashmap based on keys
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,(oldValue, newValue)-> oldValue, LinkedHashMap::new));

        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
