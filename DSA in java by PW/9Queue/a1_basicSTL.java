// package DSA in java by PW.9Queue;

import java.util.LinkedList;
import java.util.Queue;

public class a1_basicSTL {
    public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    q.remove();//for removing first
    System.out.println(q);
    q.poll(); //for removing first
    System.out.println(q);
    System.out.println(q.element()); //topmost element
    System.out.println(q.peek());//topmost element
    System.out.println(q.size());
    }

}
