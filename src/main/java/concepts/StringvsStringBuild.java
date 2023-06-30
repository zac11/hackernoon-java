package concepts;

public class StringvsStringBuild {

    public static void returnString(){
        String greeting = "Hello";
        String name = "Alice";
        String message = greeting + ", " + name + "!"; // Concatenation using +
        System.out.println(message); // Output: Hello, Alice!

    }

    public static void returnStringBuilder(){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(", ");
        builder.append("Alice");
        String message = builder.toString();
        System.out.println(message); // Output: Hello, Alice!
    }

    public static void main(String [] args){
        returnString();
        returnStringBuilder();
    }
}
