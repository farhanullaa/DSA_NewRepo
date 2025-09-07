package Sortiing;

public class CountSort {
    private static void Countsort(int[] arr) {

        int n = arr.length;
        int[] output = new int[n];

        int max = FindMax(arr);
        int [] count = new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //make the prefix sum
        for(int i =0;i< count.length;i++){
            count[i]+=count[i-1];
            
        }

    }

    private static int FindMax(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr ={1,3,4,6,3,5,6,1,7,8,8,8,8,};

        Countsort(arr);
    }

}
