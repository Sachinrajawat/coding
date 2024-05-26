// package DSA in java by PW.10Collection;

import java.util.ArrayList;
import java.util.Stack;


public class a1_ListInterface {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        // LinkedList<Integer> l=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
}
