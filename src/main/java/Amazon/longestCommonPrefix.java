package Amazon;

/**
 * Amazon Round -2 Find the largest common prefix string if available. Return an empty string
 * if there is no common prefix.
 *
 * For eg - ["flower", "flow", "flight"] --> each has a common prefix "fl"
 * Another eg - ["dog", "racecar", "car"] --> no common prefix although last two words have common prefix
 *
 */
public class longestCommonPrefix {

    public static String returnCommonPrefix(String [] strArr){
        if(strArr == null || strArr.length==0) return "";
        String prefix = strArr[0];

        for(int i =1;i<strArr.length;i++){
            while (strArr[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String [] args){
        String [] str = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix is "+returnCommonPrefix(str));

        String [] str2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix is "+returnCommonPrefix(str2));
    }
}
