package partech;

public class longestPalindrome {
    /**
     * Question was asked in Par Tech L2
     */

    static String findLongestPalindrome(String str){

        if(str == null || str.length()==0){
            return "";
        }

        String longestPalin = "";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String substring = str.substring(i,j);
                if(isPalin(substring) && substring.length() > longestPalin.length()){
                    longestPalin = substring;
                }
            }
        }

        return longestPalin;

    }

    static String findLongestSubstring(String str){
        if(str == null || str.length() == 0){
            return "";
        }
        String longest = "";
        for(int i=1;i<str.length();i++){
            for(int j= i;j<=str.length();j++){
                String substring = str.substring(i,j);
                if(isPalin(substring) && substring.length() > longest.length())
                {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    static boolean isPalin(String st){
        int start = 0;
        int end  = st.length() - 1;
        while (start < end){
            if(st.charAt(start++)!=st.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        String str = "aab";
        System.out.println(findLongestPalindrome(str));
        System.out.println(findLongestSubstring(str));
    }
}
