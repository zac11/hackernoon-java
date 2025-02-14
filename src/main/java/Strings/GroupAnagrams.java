package Strings;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            // Creat a character array from the string
            char[] charArray = str.toCharArray();

            // Sort the character array
            Arrays.sort(charArray);

            // Convert the sorted character array back to a String
            String sortedStr = new String(charArray);

            // If this sorted string is not already in the map, add it
            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagrams grouper = new GroupAnagrams();
        List<List<String>> result = grouper.groupAnagrams(strs);

        System.out.println(result); // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
}
