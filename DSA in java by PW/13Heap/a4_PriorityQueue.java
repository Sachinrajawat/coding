import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class a4_PriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> q=new PriorityQueue<>();  //min heap in java by default
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());  //max heap 
        q.add(16);
        q.add(20);
        q.add(11);
        q.add(18);
        q.add(15);
        // System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
