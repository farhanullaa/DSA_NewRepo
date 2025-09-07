package Stack;

import java.util.Stack;

public class InsertNewElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        st.push(15);
        System.out.println(st);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
