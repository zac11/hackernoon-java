package BlackRock;

import java.util.Stack;

/**
 * Given a string, find out if it is balanced or not
 * [{()}] -> true
 * [({(})] -> false
 * ({}{}([{}])) -> true
 * {["} -> false
 */
public class balancedString {
    public static void main(String [] args){
        String input = "{[\"}"; // sample test with
        boolean result = isBalancedString(input);
        if (result) {
            System.out.println(input + " is balanced.");
        } else {
            System.out.println(input + " is not balanced.");
        }
    }

    public static boolean isBalancedString(String str){
        Stack<Character> stack = new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }

            else if (ch == ')' || ch == ']' || ch == '}') {
                return false;
            }
        }

        return stack.isEmpty();
    }
;
}
