// package DSA in java by PW.2ArrayList;
import java.util.*;
public class a3_sort {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(30);
        l.add(20);
        l.add(40);
        l.add(50);
        System.out.println("Original List: "+l);
        Collections.sort(l);
        System.out.println("Sorted list"+l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Desc Order"+l);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original List: "+l1);
        Collections.sort(l1);
        System.out.println("Sorted "+l1);
    }
}
