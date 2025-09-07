package Recursion;

import java.util.Scanner;

public class Remove_Occurence {
    private static String RemoveElemenets(String s, int idx) {
        // base case
        if (idx == s.length()) return " ";

        //Recursive work
        String smallAns = RemoveElemenets(s, idx + 1);
        char currAns = s.charAt(idx);

        if (currAns != 'a') {
            return currAns + smallAns;
        } else
            return smallAns;
    }

    private static String RemoveElements_subarray(String s) {

        if (s.isEmpty()) return " ";

        String smallAns = RemoveElements_subarray(s.substring(1));
        char currans = s.charAt(0);
        if (currans != 'a') {
            return currans + smallAns;

        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(RemoveElemenets(s, 0));

        System.out.println(RemoveElements_subarray(s));

    }
}
