package Stack;

import java.util.Scanner;

public class BalanceBracket_MinNumber {
//    private static int minNoBalanced(String str) {
//        Stack<Character> st = new Stack<>();
//        int n = str.length();
//        for (int i = 0; i < n; i++) {
//            char ch = str.charAt(i);
//            if (ch == '(') {
//                st.push(ch);
//            } else if (ch == ')') { // ch==')'
//                if (!st.isEmpty() && st.peek() == '(') {
//                    st.pop();
//                } else {
//                    st.push(ch);
//                }
//            }
//        }
//        return st.size();

        private static int minNoBalanced (String str){
            int unmatchedOpen = 0;  // Counter for unmatched '('
            int unmatchedClose = 0; // Counter for unmatched ')'

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(') {
                    unmatchedOpen++;  // Increase unmatched opening brackets
                } else if (ch == ')') {
                    if (unmatchedOpen > 0) {
                        unmatchedOpen--;  // Match one unmatched opening bracket '('
                    } else {
                        unmatchedClose++; // If no unmatched opening, increase unmatched closing brackets
                    }
                }
            }

            // Total unbalanced brackets = unmatched opening + unmatched closing
            return unmatchedOpen + unmatchedClose;

    }


    public static void main(String[] args) {
        // Record the start time of the program
        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Get the result from minNoBalanced
        System.out.println(minNoBalanced(str)); // Print the result

        // Record the end time of the program
        long endTime = System.nanoTime();

        // Calculate and print the elapsed time in nanoseconds
        long duration = endTime - startTime;
        System.out.println("Processing Time (in nanoseconds): " + duration);

    }
}
