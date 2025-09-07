package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch_Recursion {
    private static boolean linearSearch(int[] arr, int n, int target, int idx) {
        //base case
        if (idx == n) return false;

        // self work
        if (arr[idx] == target) return true;

        // recursive work
        return linearSearch(arr, n, target, idx + 1);
    }

    private static int linersearch_returnIndex(int[] arr, int n, int target, int idx) {
        //base case
        if (idx == n) return -1;

        // self work
        if (arr[idx] == target) return idx;

        return linersearch_returnIndex(arr, n, target, idx + 1);
    }

    private static void linearsearch_FindAllIndices(int[] arr, int n, int target, int idx) {
        //base case
        if (idx == n) return;

        // self work
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        linearsearch_FindAllIndices(arr, n, target, idx + 1);
    }

    private static int[] linearsearch_IdxArray(int[] arr, int n, int target, int idx) {
        //base case
        if (idx == n) return new int[0];

        int[] rest = linearsearch_IdxArray(arr, n, target, idx + 1);

        // self work
        if (arr[idx] == target) {
            int[] result = new int[rest.length + 1];
            result[0] = idx;
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        }
        return rest;
    }

    private static List<Integer> linearsearch_ArrayList(int[] arr, int n, int target, int idx) {
        //base case
        if (idx == n) return new ArrayList<>();

        //recrsive work
        List<Integer> result = linearsearch_ArrayList(arr, n, target, idx + 1);

        // self work
        if (arr[idx] == target) {
            result.add(0, idx);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 5, 6, 7, 7, 7};
        int target = 7;
//        System.out.println(linearSearch(arr, arr.length, target, 0));
//
//        System.out.println(linersearch_returnIndex(arr, arr.length, target, 0));

//        linearsearch_FindAllIndices(arr, arr.length, target, 0);

//        int[] rest = linearsearch_IdxArray(arr, arr.length, target, 0);
//
//        for (int idx : rest) {
//            System.out.println(idx);
//        }

        List<Integer> arrayList = linearsearch_ArrayList(arr, arr.length, target, 0);

        for (int idx : arrayList) {
            System.out.println(idx);
        }
    }
}



