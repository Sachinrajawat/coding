// package DSA in java by PW.8Stacks;

import java.util.Stack;
//insert at bottom
public class a4_insertBottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();

        //insert at bottom
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // st.push(0);
        // while(rt.size()>0){
        //     st.push(rt.pop());
        // }
        // System.out.println(st);

        //insert at any index
        // M1
        // st.insertElementAt(6, 4);
        // System.out.println(st);

        //M2
        while(st.size()>2){
            rt.push(st.pop());
        }
        st.push(6);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
