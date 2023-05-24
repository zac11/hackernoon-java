package Strings;

public class lengthOfString_woinbuiltMethod {

    // print the length of a string without using in built method

    public static int returnLenght(String str){
        int i = 0;
        for(char c : str.toCharArray()){
            i++;
        }
        return i;
    }

    public static void main(String [] args){
        String str = "Anubha";
        int lengthOfString  = returnLenght(str);
        System.out.println("Length is ---->"+lengthOfString);
    }
}
