package Stack;

import java.util.Stack;

public class NextGreaterElement_UsingStacks_StockSpanProblem {
    public static void main(String[] args) {
        int[] price = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] arr = new int[price.length];
        int n = price.length;
        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[i] >= price[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) arr[i] = i + 1;
            else arr[i] = i - st.peek();
            st.push(i);
        }

        for (int j : price) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int re : arr) {
            System.out.print(re + " ");
        }
    }
}
