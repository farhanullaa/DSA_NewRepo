package Stack;

import java.util.Stack;

public class DisplayReverseStack_Recursion {
    public static void Displayreverse(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        Displayreverse(st);
        st.push(top);
    }
    public static void Display(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        Display(st);
        System.out.println(top+" ");
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);

        Displayreverse(st);

        Display(st);
    }
}
