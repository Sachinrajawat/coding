// package JAVA KG CODING.OOPS.5Collection&Generics;

//Create a program that reverses the elements of a list and prints the reversed list

import java.util.*;

public class g_prob93 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }
}
