package Arrays;

public class RepeatingNumber {
    private static int firstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 3, 4};
        System.out.println(firstRepeatingNumber(arr));
    }
}
