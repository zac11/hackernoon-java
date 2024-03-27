package Labs49;


import java.util.HashMap;
import java.util.Map;

/**
 * Using Java 8 streams, compare two hashmaps and print common values and key
 */
public class compareTwoMapsJava8 {
    public static void main(String [] args){
        Map<String, String > asia1 = new HashMap<>();
        asia1.put("Japan", "Tokyo");
        asia1.put("South Korea", "Seoul");


        Map<String,String> asia2 = new HashMap<>();
        asia2.put("South Korea", "Seoul");
        asia2.put("Japan", "Tokyo");
        asia2.put("United Kingdom", "London");

        asia1.entrySet().stream()
                .filter(entry -> asia2.containsKey(entry.getKey()) && asia2.get(entry.getKey()).equals(entry.getValue()))
                .forEach(entry -> System.out.println(entry.getKey()+ " -"+entry.getValue()));
    }
}
