package Arrays;

import java.util.Arrays;

public class FindSmallestAndLargest {
    public static int[] smallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 5, 6, 7, 8, 9, 9, 6, 8, 25};
        int[] ans = smallestAndLargest(arr);
        System.out.println("Smallest : " + ans[0]);
        System.out.println("Largest : " + ans[1]);
    }
}
