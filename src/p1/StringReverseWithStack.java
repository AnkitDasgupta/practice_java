package p1;

import java.util.Stack;

        public class StringReverseWithStack {

            public static String reverseString(String str) {

                Stack<Character> stack = new Stack<>();


                for (int i = 0; i < str.length(); i++) {
                    stack.push(str.charAt(i));
                }


                StringBuilder reversedStringBuilder = new StringBuilder();


                while (!stack.isEmpty()) {
                    reversedStringBuilder.append(stack.pop());
                }


                return reversedStringBuilder.toString();
            }

            public static void main(String[] args) {


                String str1 = "hello";
                System.out.println("Original string: '" + str1 + "'");
                System.out.println("Reversed string: '" + reverseString(str1) + "'\n");

                String str2 = "Java Programming";
                System.out.println("Original string: '" + str2 + "'");
                System.out.println("Reversed string: '" + reverseString(str2) + "'\n");

                String str3 = "12345";
                System.out.println("Original string: '" + str3 + "'");
                System.out.println("Reversed string: '" + reverseString(str3) + "'\n");

                String str4 = ""; // Empty string
                System.out.println("Original string: '" + str4 + "'");
                System.out.println("Reversed string: '" + reverseString(str4) + "'\n");

                String str5 = "a"; // Single character string
                System.out.println("Original string: '" + str5 + "'");
                System.out.println("Reversed string: '" + reverseString(str5) + "'\n");

                String str6 = "Racecar"; // Palindrome test
                System.out.println("Original string: '" + str6 + "'");
                System.out.println("Reversed string: '" + reverseString(str6) + "'\n");
            }
        }
