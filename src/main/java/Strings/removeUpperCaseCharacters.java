package Strings;

public class removeUpperCaseCharacters {
    /**
     * Given a string , remove the characters that are in upper case
     */

    public static String removeUpperCaseChars(String str){
        StringBuilder finalstr = new StringBuilder();
        for(char c: str.toCharArray()){
            if(!Character.isUpperCase(c)){
                finalstr.append(c);
            }
        }

        return finalstr.toString();
    }

    public static void main(String [] str){
        String input = "HellO I am RahuL";
        String output = removeUpperCaseChars(input);
        System.out.println(output);
    }
}
