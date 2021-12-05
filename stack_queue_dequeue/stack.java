package stack_queue_dequeue;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(15);
        st.push(20);
        st.push(30);
        System.out.println("Current Stack: " + st);
        while (st.isEmpty() == false) {
            st.pop();
        }
        st.push(5);
        st.push(50);
        System.out.println("Current stack" + st);
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
