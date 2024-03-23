// package JAVA KG CODING.OOPS.5Collection&Generics;

import java.util.*;

public class i_TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sachin", 10);
        map.put("Ankit", 100);
        map.put("Himanshu", 20);
        map.put("Alisha", 50);
        System.out.println(map.size());
        System.out.println(map.get("Sachin"));
        System.out.println(map.containsKey("Ankit"));
        System.out.println(map.containsKey("geeta"));
        System.out.println(map.remove("Alisha"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n",key,map.get(key));
        }
    }
}
