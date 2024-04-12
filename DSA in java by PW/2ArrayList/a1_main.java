// package DSA in java by PW.2ArrayList;

import java.util.ArrayList;

public class a1_main {
    public static void main(String[] args) {
        //Wrapper classes
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        // Float f= Float.valueOf(4.5f);
        // System.out.println(f);

        ArrayList<Integer> l1=new ArrayList<>();
        // ArrayList<Boolean> l2=new ArrayList<>();
        // ArrayList<Float> l2=new ArrayList<>();

        // add new element
        l1.add(5); //5
        l1.add(6); //5 6
        l1.add(7); //5 6 7
        l1.add(8); 

        //get an element at index i
        System.out.println(l1.get(1));  //6

        //print with for loop
        for (int j = 0; j < l1.size(); j++) {
            System.out.print(l1.get(j)+" ");  //5, 6, 7, 8
        }
        System.out.println();
        //printing the array list directly
        System.out.println(l1); //[5, 6, 7, 8]

        //adding element at some index i
        l1.add(1, 100);
        System.out.println(l1); //[5, 100, 6, 7, 8]

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1); //[5, 10, 6, 7, 8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1); //[5, 6, 7, 8]

        //removing an element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1); //[5, 6, 7]

        //checking if an elements exists
        boolean ans= l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you dont specify class, you can put aNYTHING INSIDE L

        ArrayList l=new ArrayList();
        l.add("SAchin");
        l.add(1);
        l.add(true);
        System.out.println(l);

    }
}
