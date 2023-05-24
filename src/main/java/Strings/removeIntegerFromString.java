package Strings;

public class removeIntegerFromString {

    // given a string with integers, remove the integers

    /**
     * Approach 1
     * @param str
     */
    public static String removeIntegers(String str){
        str = str.replaceAll("[\\d+]","");
        return str;
    }


    /**
     * Approach 2
     * @param str
     */
    public static void removeIntegerFromStringApproach2(String str){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i< str.length()){
            char c = str.charAt(i);
            if(!Character.isDigit(c)){
                sb.append(c);
            }
            i++;
        }
        str = sb.toString();
        System.out.println("Using approach 2 ----> "+str);
    }

    public static void main(String [] args){
        String str = "akd2233sda33ad";
        System.out.println("Remove from first approach---->"+removeIntegers(str));
        removeIntegerFromStringApproach2(str);

    }
}
