// package JAVA KG CODING.OOPS.5Collection&Generics;

// write a method that swaps two elements in an ArrayList, given thier indices 

import java.util.*;

public class g_prob92 {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
    System.out.println(list);
    swap(list, 2, 7);
    System.out.println(list);
    }
    public static void swap(List<Integer> list,int x,int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
