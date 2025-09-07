package Arrays;

public class CheckArraySortedOrNot {
    public static boolean Sorted(int[] arr)
    {
        boolean check = true;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]) {
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 7, 10, 5, 6, 7, 8, 9, 9, 6, 8, 25};
        int [] arr1={1,2,3, 5, 4};
        System.out.println(Sorted(arr1));
    }
}
