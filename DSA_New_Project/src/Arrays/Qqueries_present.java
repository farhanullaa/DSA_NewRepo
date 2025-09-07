package Arrays;

import java.util.Scanner;

public class Qqueries_present {
    private static int[] makefrequencyArray(int[] arr) {
        int[] freq = new int[1000005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 7, 34, 23, 54, 76, 87, 45, 67, 234543, 2343};
        int[] freq = makefrequencyArray(arr);
        System.out.println("Enter the no of Element");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the Number to be searched");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
    }

}
