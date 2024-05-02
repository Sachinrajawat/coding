// package HASHMAP;

import java.util.*;

public class a1_mapBasics {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        //adding element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        //getting value of a key from the hashMap
        System.out.println(mp.get("Yash"));// 16
        System.out.println(mp.get("Rahul")); //null

        //changing/updating value of a key in the hashmao
        mp.put("Akash", 25); //Akash --> 25
        //Removing a pair from the hashMap
        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.remove("riya")); //null
        // checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); //true

        //adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30); //will enter
        mp.putIfAbsent("Yash", 30); // will not enter
        //get all keys in the HashMap
        System.out.println(mp.keySet());

        //get all values inthe HashMap
        System.out.println(mp.values());

        //get all the entries in the HashMap
        System.out.println(mp.entrySet());

        //Traversing all the entries of HashMap - multiple methods
        System.out.println("\ntraversing Method: ");
        System.out.println("\nM1: ");
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println("\nM2: ");
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println("\nM3");
        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }
}
