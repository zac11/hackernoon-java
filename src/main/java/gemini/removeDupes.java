package gemini;

import java.util.HashSet;
import java.util.Set;

public class removeDupes {

    public static String removeDupesWoMap(String str){
        // create  new strinbuilder object
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(sb.indexOf(String.valueOf(c))==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String returnDupeWords(String str){
        String newString = "";
        boolean [] seen = new boolean[256];

        for(char c: str.toCharArray()){
            if(!seen[c]){
                newString+=c;
                seen[c] = true;
            }
        }
        return newString;
    }

    public static String returnDupeWords_Attempt2(String str){
        Set<Character> hs = new HashSet<>();
        String newString = "";

        for(char c: str.toCharArray()){
            if(!hs.contains(c)){
                newString+=c;
                hs.add(c);
            }
        }

        return newString;
    }

    public static void main(String [] args){
        String str = "my name is rahul yadav";
        String withoutrepeated = removeDupesWoMap(str);
        String newwithoutrepeated = returnDupeWords(str);
        String thirdAttempt = returnDupeWords_Attempt2(str);
        System.out.println("Without repeated---->"+withoutrepeated);
        System.out.println("Without repeated second ---->"+newwithoutrepeated);
        System.out.println("Without repeated third ---->"+thirdAttempt);
    }
}
