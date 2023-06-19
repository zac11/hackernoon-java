package Strings;

public class printAllSubstrings {
    /**
     * Given a string str, print all its substrings
     */

    public static void printSubStr(String str){
        int len = str.length();

        for(int i=0;i<len;i++){
            StringBuilder substr = new StringBuilder();
            for(int j=i;j<len;j++){
                substr.append(str.charAt(j));
                System.out.println("Substring--> "+substr);
            }
        }
    }

    public static void main(String [] args){
        String str = "Reddit";
        System.out.println("All substrings are:");
        printSubStr(str);
    }
}
