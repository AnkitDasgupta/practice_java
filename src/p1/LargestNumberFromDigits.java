package p1;

import java.util.Arrays;

public class LargestNumberFromDigits {

    public static void main(String[] args) {

        int num = 2587;

        char[] digits = String.valueOf(num).toCharArray();

        Arrays.sort(digits);

        StringBuilder result = new StringBuilder(new String(digits));
        result.reverse();

        System.out.println("Output: " + result);
    }
}

