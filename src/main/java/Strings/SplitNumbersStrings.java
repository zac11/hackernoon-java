package Strings;

public class SplitNumbersStrings {

    public static void splitIntegerString(String input){
        String[] parts = input.split("-");
        for (String part : parts) {
            System.out.print("[" + part + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input1 = "JavaLearning-2024";
        System.out.print("Input: \"JavaLearning-2024\" => Output: ");
        splitIntegerString(input1);

        String input2 = "Best-Course-Ever";
        System.out.print("Input: \"Best-Course-Ever\" => Output: ");
        splitIntegerString(input2);

        String input3 = "NoHyphenHere";
        System.out.print("Input: \"NoHyphenHere\" => Output: ");
        splitIntegerString(input3);
    }
}
