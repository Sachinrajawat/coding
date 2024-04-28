// package DSA in java by PW.8Stacks;
import java.util.*;
public class a6_reverse {
    public static void pushAtbottom(Stack<Integer> s,int val){
        if(s.size()==0){
            s.push(val);
            return;
        }
        int top=s.pop();
        pushAtbottom(s, val);
        s.push(top);
    }
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        displayReverseRec(st);
        pushAtbottom(st,top);
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
        System.out.println(st);
    }
}
