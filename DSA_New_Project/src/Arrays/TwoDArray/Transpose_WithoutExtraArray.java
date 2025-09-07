package Arrays.TwoDArray;

import java.util.Scanner;

public class Transpose_WithoutExtraArray {
    private static int[][] transpose_WithoutExtraArray(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
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

        int [][] result = transpose_WithoutExtraArray(arr, r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }


}
