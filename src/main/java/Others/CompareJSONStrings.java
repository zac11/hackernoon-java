package Others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareJSONStrings {

    public static Map<String,String> parsingJSON(String jsonValue){
        jsonValue = jsonValue.trim();
        if(jsonValue.startsWith("{")) jsonValue = jsonValue.substring(1);
        if(jsonValue.endsWith("}")) jsonValue = jsonValue.substring(0, jsonValue.length()-1);


        Map<String, String> result = new HashMap<>();
        String [] jsonPairs = jsonValue.split(", ");
        for (String pairs : jsonPairs){
            String [] keyVal = pairs.split(": ");
            String key = keyVal[0].replaceAll("\"", "");
            String value  = keyVal[1].replaceAll("\"", "");
            result.put(key, value);

        }

        return result;

    }
    public static List<String> findDiffKeys(String json1, String json2){
        Map<String, String> map1 = parsingJSON(json1);
        Map<String, String> map2 = parsingJSON(json2);

        List<String> diffKeys = new ArrayList<>();
        for (String key : map1.keySet()){
            if(map2.containsKey(key) && !map1.get(key).equals(map2.get(key))){
                diffKeys.add(key);
            }
        }
        return diffKeys;
    }

    public static void main(String [] args){
        String jsonStr1 = "{\"a\": 1, \"b\": 2, \"c\": 3}";
        String jsonStr2 = "{\"a\": 1, \"b\": 3, \"c\": 3, \"d\": 4}";
        List<String> differingKeys = findDiffKeys(jsonStr1, jsonStr2);
        System.out.println(differingKeys);  // Output: [b]

        String jsonStr3 = "{\"name\": \"Alice\", \"age\": 25, \"city\": \"New York\"}";
        String jsonStr4 = "{\"name\": \"Alice\", \"age\": 30, \"city\": \"Los Angeles\", \"country\": \"USA\"}";
        differingKeys = findDiffKeys(jsonStr3, jsonStr4);
        System.out.println(differingKeys);  // Output: [age,
    }


}
