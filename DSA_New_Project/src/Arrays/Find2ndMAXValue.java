package Arrays;

public class Find2ndMAXValue {
    private static int SecondMaxvalue(int[] arr) {
        int max = FindMaxValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmaxvalue = FindMaxValue(arr);
        return secondmaxvalue;
    }

    private static int FindMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3, 8, 5, 7};
        System.out.println(SecondMaxvalue(arr));
    }
}
