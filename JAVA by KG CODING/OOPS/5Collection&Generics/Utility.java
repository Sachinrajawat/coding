// package JAVA KG CODING.OOPS.5Collection&Generics;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection) {
        System.out.print("collection is: ");
        for(E coll : collection){
            System.out.printf("%s ",coll);
        }
        System.out.println();
    }
}
