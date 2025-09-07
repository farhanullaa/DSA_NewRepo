package Arrays.TwoPointers;

public class SubArrayInEqualSize {
    private static boolean EqualSumPartition(int[] arr) {
        int totalSum = FindArraySum(arr);
        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix = prefix + arr[i];
            int suffix = totalSum - prefix;
            if (prefix == suffix) {
                return true;
            }
        }
        return false;
    }

    private static int FindArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};
        boolean result = EqualSumPartition(arr);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
