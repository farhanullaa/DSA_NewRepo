package Stack;

import java.util.Stack;

public class NextGreaterElement_UsingStacks_ForwardFlow {
    public static void main(String[] args) {
        int[] price = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] arr = new int[price.length];
        int n = price.length;
        Stack<Integer> st = new Stack<>();

        st.push(0);

        System.out.println(st);
        // Traverse the array from left to right
        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while they are less than or equal to the current element
            while (!st.isEmpty() && price[i] > price[st.peek()]) {
                arr[i-1] = price[i];
                st.pop();
            }

            // If the stack is empty, there's no greater element, set it as -1
            if (st.isEmpty()) {
                st.push(price[i]);
            }
            
//            } else {
//                arr[i] = price[st.peek()];
//            }

            // Push the current index to the stack for future comparisons
            st.push(i);
        }

        // Output the original price array
        System.out.println("Prices: ");
        for (int j : price) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Output the next greater element array
        System.out.println("Next Greater Element: ");
        for (int re : arr) {
            System.out.print(re + " ");
        }
    }
}
