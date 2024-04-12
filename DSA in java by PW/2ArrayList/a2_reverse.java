// package DSA in java by PW.2ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class a2_reverse {
    // M-1
    /* 
    static void reverseList(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while (i<j) {
            int temp=list.get(j);
            list.set(j, list.get(i));
            list.set(i,temp);
            i++;
            j--;
        }
    }*/

    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println("Original List: "+l);
        // reverseList(l);

        //M-2
        Collections.reverse(l);
        System.out.println("Reversed List: "+l);
    }
}
