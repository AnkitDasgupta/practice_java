package p1;
import java.util.Scanner;

public class StringSimilarity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            System.out.println(calculateSimilaritySum(s));
        }

        scanner.close();
    }


    public static int calculateSimilaritySum(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            total += commonPrefixLength(s, s.substring(i));
        }

        return total;
    }


    public static int commonPrefixLength(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
