
import java.util.*;
public class a1_stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(5);
        st.push(4);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is: "+st.size());
        while (st.size()>2) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
