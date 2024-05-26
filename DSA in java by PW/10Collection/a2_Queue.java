// package DSA in java by PW.10Collection;

import java.util.*;

public class a2_Queue {
    static void QueueExam(){
        LinkedList<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
    }
    static void PriorityQueue(){
        // PriorityQueue<Integer> pq=new PriorityQueue<>(); //min PQ
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //Max PQ
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 - smallest elem has the highest priority queue
        System.out.println(pq); // guarantee -  topmost priority elem will be processed first
        System.out.println(pq.poll());  //5
        System.out.println(pq);

    }
    public static void main(String[] args) {
        QueueExam();
        PriorityQueue();
    }
}
