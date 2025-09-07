package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo_FirstElementInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        int num ;
        num = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the elements : ");

        for(int i=0;i<num;i++)
        {
            int n = sc.nextInt();
            st.push(n);
        }
        System.out.println(st);

        System.out.println(st.peek());
        while(st.size()>1)
        {
            st.pop();
        }
        System.out.println(st.peek());


    }
}
