package Strings;

import java.util.HashMap;

// length of the longest substring that contains at most k distinct characters
public class longestDistinctSubstring {

    public static void main(String [] args){
        String str1 = "aabbbbbccc";
        int k1 = 2;
        System.out.println(longestSubstring_w_KCharacters(str1,k1));

        String str2 = "aabbbbbccc";
        int k2 = 1;
        System.out.println(longestSubstring_w_KCharacters(str2,k2));
    }

    public static int longestSubstring_w_KCharacters(String str, int k){

        if (str == null || str.length() == 0 || k == 0) return 0;

        HashMap<Character,Integer> chMap = new HashMap<>();
        int l=0, mxLength=0;

        for(int r=0;r<str.length();r++){
            char rightChar = str.charAt(r);
            chMap.put(rightChar,chMap.getOrDefault(rightChar,0)+1);
            while(chMap.size()> k){
                char leftChar = str.charAt(l);
                chMap.put(leftChar,chMap.getOrDefault(leftChar,0)-1);
                if(chMap.get(leftChar)==0){
                    chMap.remove(leftChar);
                }
                l++;
            }
        mxLength = Math.max(mxLength,r-l+1);
        }

        return mxLength;
    }
}
