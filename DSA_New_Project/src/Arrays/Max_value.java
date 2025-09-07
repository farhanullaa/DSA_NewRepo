package Arrays;

public class Max_value {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 3, 6, 7, 8, 9, 5, 6, 8, 25};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
