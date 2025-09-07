package Arrays;

import java.util.Arrays;

public class FindKthSmallestAndLargest {
    public static int[] KthsmallestAndLargest(int[] arr, int kth) {
        Arrays.sort(arr);
        int[] ans = {arr[kth-1], arr[arr.length - kth]};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 9, 8, 25};
        int kth = 3;
        int[] ans = KthsmallestAndLargest(arr, kth);
        System.out.println("Smallest : " + ans[0]);
        System.out.println("Largest : " + ans[1]);
    }
}
