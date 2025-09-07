package Recursion;

public class MaxInArray {
    private static int MxInArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = MxInArray(arr, idx + 1);

        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 23, 54, 78, 4, 6, 3,-1};
        System.out.println(MxInArray(arr, 0));
    }
}
