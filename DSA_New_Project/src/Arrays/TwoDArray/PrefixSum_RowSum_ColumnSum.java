package Arrays.TwoDArray;

import java.util.Scanner;

public class PrefixSum_RowSum_ColumnSum {

    private static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
        FindPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];

        if (r1 >= 1) {
            left = matrix[l2][r1 - 1];
        }
        if (l1 >= 1) {
            up = matrix[l1 - 1][r2];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftup = matrix[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + leftup;
        return ans;

    }

    private static void FindPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // traverse vertically to calculate column-wise
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int num = sc.nextInt();
        int[][] matrix = new int[num][num];
        System.out.println("Enter the elements in the matrix : ");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the boundries : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int result = findSum3(matrix, l1, r1, l2, r2);
        System.out.println(result);
    }

}
