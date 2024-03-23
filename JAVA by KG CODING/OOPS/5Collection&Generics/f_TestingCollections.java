// package JAVA KG CODING.OOPS.5Collection&Generics;

import java.util.ArrayList;
import java.util.*;

public class f_TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(52);
        numList.add(-5);
        Utility.print(numList);
        Collections.sort(numList);
        System.out.print("After sorting ");
        Utility.print(numList);
        Collections.reverse(numList);
        System.out.print("After Reversing ");
        Utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        // unmodifiable.add(87);  we cann't modified it now
    }
}
