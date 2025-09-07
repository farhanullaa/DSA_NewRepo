package Arrays.TwoDArray;

import java.util.Scanner;

public class Pascal_Triangle {
    private static int[][] pascal(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            //Jagged Array - ith row has (i+1) column
            ans[i] = new int[i + 1];

            //First and Last element is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[][] ans = pascal(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();

        }
    }

}
