// package DSA in java by PW.9Queue;

import java.util.LinkedList;
import java.util.Queue;

public class a2_print {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.remove()+" ");
        }
    }
}
