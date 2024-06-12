import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class a7_reverseFirstK {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Stack<Integer> st=new Stack<>();
        int x=q.size();
        int k=5;
        while(q.size()>x-k){
            st.push(q.remove());
        }
        while (st.size()>0) {
            // q.ad(st.pop());
            q.add(st.pop());
        }
        int i=0;
        while(i<q.size()-k){
            q.add(q.remove());
            i++;
        }
        System.out.println(q);
    }
}
