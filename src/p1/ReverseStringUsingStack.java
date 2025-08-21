package p1;

    import java.util.Stack;

    public class ReverseStringUsingStack {

        public static String reverseString(String input) {
            // Step 1: Create a stack of characters
            Stack<Character> stack = new Stack<>();

            // Step 2: Push all characters of the input string into the stack
            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }

            // Step 3: Pop all characters from the stack and append to a StringBuilder
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            // Step 4: Return the reversed string
            return reversed.toString();
        }

        public static void main(String[] args) {
            String original = "HelloWorld";
            String reversed = reverseString(original);
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
        }
    }
