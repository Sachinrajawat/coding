// package DSA in java by PW.10Collection;

import java.util.*;

public class a3_Set {
    public static void Hashset(){ //unordered  //most efficient //O(1)
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); //only uniue element
        System.out.println(st.size());
        st.remove(2);
        System.out.println(st);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);  //unorder print hote h
    }
    public static void LinkedHashSet(){ //ordered //efficient
        LinkedHashSet<Integer> st=new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); //only uniue element
        System.out.println(st.size());
        st.remove(2);
        System.out.println(st);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);  //order print hote h
    }
    public static void treeSet(){ //less efficient //O(log(n))
        TreeSet<Integer> st=new TreeSet<>(); 
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); //only uniue element
        System.out.println(st.size());
        st.remove(2);
        System.out.println(st);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);  //sorted order me print hote h
    }
    public static void main(String[] args) {
        System.out.println("HashSet: "); //unordered
        Hashset();
        System.out.println("\nLinkedHashSet: "); //ordered
        LinkedHashSet();
        System.out.println("\nTreeSet: "); //in sorted order
        treeSet();
    }
}
