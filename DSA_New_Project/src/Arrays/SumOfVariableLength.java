package Arrays;

public class SumOfVariableLength {
    private static int subArray(int[] arr) {
        int sum=0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i-arr[i]);
            System.out.println("Start value : "+start);
            for (int j = start; j <=i ; j++) {
                sum= sum+arr[j];
                System.out.println("sum value : "+sum+" ");
            }
        }
        return sum;
    }
    public static void main(String[] args) {
     int [] arr ={3,1,1,2};
     int sum = subArray(arr);
        System.out.print(sum+" ");
    }
}
