package Arrays;

public class ReverseArrayWithoutUsingExtraArray {

    private static int[] ReverseArray(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            SwapInArray(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    private static void SwapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ReverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
