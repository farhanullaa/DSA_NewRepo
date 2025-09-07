package Stack;

import java.util.Stack;

public class NextGreaterElement_UsingStacks_BackwardFlow {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 1, 8, 9, 13, 14};
        int[] res = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
