// package DSA in java by PW.8Stacks;
import java.util.*;
public class a5_display {
    public static void displayReverseRec(Stack<Integer> st){

        //print reverse stack
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+ " ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){

        //print reverse stack
        if(st.size()==0) return;
        int top=st.pop();
        displayRec(st);
        System.out.print(top+ " ");
        
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.print("display reverse: ");
        displayReverseRec(st);
        System.out.println();
        System.out.println(st);
        displayRec(st);
    }
}
