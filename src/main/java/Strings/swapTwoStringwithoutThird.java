package Strings;

public class swapTwoStringwithoutThird {
    /**
     * Given two strings str1 and str2, swap their values without using a third string
     */

    public static void swapStrings(String str1, String str2){
        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // swapping of the strings
        str1+= str2; // concatenate the two strings
        str2=str1.substring(0,str1.length()-str2.length());
        str1= str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }

    public static void main(String [] args){
        String str1 = "Gello";
        String str2 = "Bello";
        swapStrings(str1,str2);
    }
}
