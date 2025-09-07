package Stack;

import java.util.Stack;

public class ReverseStackWithOutExtraStack_Recursion {
    private static void PushAtBottom(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }
        int top = st.pop();
        PushAtBottom(st, value);
        st.push(top);
    }

    private static void reverse(Stack<Integer> st) {
        if (st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        PushAtBottom(st, top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }


}
