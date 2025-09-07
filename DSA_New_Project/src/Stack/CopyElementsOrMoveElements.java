package Stack;

import java.util.Stack;

public class CopyElementsOrMoveElements {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        System.out.println(temp);

        Stack<Integer> rt = new Stack<>();

        while (!temp.isEmpty()) {
            rt.push(temp.pop());
        }
        System.out.println(rt);
    }
}
