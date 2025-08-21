package p1;

import java.util.Stack;

public class BalancedBrackets {


    public static boolean hasBalancedBrackets(String expression) {

        Stack<Character> stack = new Stack<>();


        for (char ch : expression.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }


                char lastOpenBracket = stack.pop();


                if (ch == ')' && lastOpenBracket != '(') {
                    return false;
                } else if (ch == '}' && lastOpenBracket != '{') {
                    return false;
                } else if (ch == ']' && lastOpenBracket != '[') {
                    return false;
                }
            }

        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String input1 = "{[( )]}";
        System.out.println("Input: \"" + input1 + "\" → Output: " + (hasBalancedBrackets(input1) ? "Balanced" : "Not Balanced"));

        String input2 = "{[( ])}";
        System.out.println("Input: \"" + input2 + "\" → Output: " + (hasBalancedBrackets(input2) ? "Balanced" : "Not Balanced"));

    }}