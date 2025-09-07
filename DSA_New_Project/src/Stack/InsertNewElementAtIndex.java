package Stack;

import java.util.Stack;

public class InsertNewElementAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        Stack<Integer> temp = new Stack<>();

        int index = 3;
        int value = 7;
        while (st.size() > index) {
            temp.push(st.pop());
        }
        st.push(value);

        System.out.println(st);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
