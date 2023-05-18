package Strings;

public class removeSpecificCharacters {

    // given a string remove a particular character and print the output

    public static String removeParticularAlphabet(String str, char target){
        StringBuilder output = new StringBuilder(); // since we want a new string with the output

        for(char c : str.toCharArray()){
            if(c!=target){ // condition check -> if the current character is not equal to target char,
                                // add it to the output
                output.append(c);
            }
        }

        return output.toString();
    }

    public static void main(String [] args){
        String str = "Java is not easy";  // output should be {Jv is not esy}
        String newString = removeParticularAlphabet(str, 'a');
        System.out.println(newString);
    }
}
