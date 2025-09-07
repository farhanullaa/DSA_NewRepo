package Recursion;
import java.util.Scanner;

public class palindrome {
    private static String reverse_value(String s, int idx) {
        if (idx == s.length()) return "";
        String smallans = reverse_value(s, idx + 1);
        return smallans + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = reverse_value(s, 0);
        if (result.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
