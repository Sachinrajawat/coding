// package JAVA KG CODING.OOPS.5Collection&Generics;

import java.util.HashSet;
import java.util.Set;

public class e_TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Sachin"));
        System.out.println(names.add("Rajawat"));
        System.out.println(names.add("Singh"));
        Utility.print(names);
        System.out.println(names.add("Sachin"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Sachin"));
        System.out.println(names.remove("Sachin"));
        Utility.print(names);

    }
}
