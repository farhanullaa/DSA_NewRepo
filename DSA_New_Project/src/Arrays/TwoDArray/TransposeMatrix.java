package Arrays.TwoDArray;

import java.util.Scanner;

public class TransposeMatrix {
    private static int[][] FindTranspose_Bruteforce(int[][] arr, int r, int c) {
        int[][] transpose = new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of Colunms");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       int [][] result = FindTranspose_Bruteforce(arr, r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
