package Arrays.TwoDArray;

import java.util.Scanner;

public class PrefixSum_RowSum {
    private static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSum(matrix);
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    private static void findPrefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
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

       int result = findSum2(matrix, l1, r1, l2, r2);
        System.out.println(result);
    }

}
