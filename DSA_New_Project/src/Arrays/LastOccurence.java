package Arrays;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 5, 6, 7, 8, 9, 9, 6, 8, 25};
        int x = 5;
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
