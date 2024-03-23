// package JAVA KG CODING.OOPS.5Collection&Generics;

//use the collection class to count the frequency of a particular element in an ArrayList

import java.util.Arrays;
import java.util.*;
import java.util.Collections;

public class g_prob91 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,4,5,3,7,5,8);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 4));
        System.out.println(Collections.frequency(list, 3));
    }
}
