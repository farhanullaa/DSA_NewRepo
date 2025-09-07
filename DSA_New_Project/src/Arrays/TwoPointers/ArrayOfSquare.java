package Arrays.TwoPointers;

public class ArrayOfSquare {
    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
//        All inputs are Positive values
//        int [] arr = {1, 3, 5, 7, 8, 10, 14, 16};
//        All inputs are negative values
//        int [] arr = {-10, -5, -4, -3, -2};
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1, k = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k--;
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                k--;
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
