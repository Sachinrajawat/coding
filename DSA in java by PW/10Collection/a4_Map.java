// package DSA in java by PW.10Collection;
import java.util.*;
public class a4_Map {
    public static void HashMap(){ //unordered
        Map<Integer,String> mp=new HashMap<>();
        mp.put(3,"Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        System.out.println(mp);
        System.out.println(mp.get(2)); //Riya
        System.out.println(mp.containsKey(4)); //false
        mp.put(1,"Priya");
        System.out.println(mp); 
        mp.putIfAbsent(2, "Sachin");
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        
        //Iterate over keys
        for(Integer i:mp.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over values
        for(String i:mp.values()){ //we can var inplace of datatypes 
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over the key, value mapping
        for(var e:mp.entrySet()){
            System.out.print(e.getValue()+" ");
        }
        System.out.println();
        for(var e:mp.entrySet()){
            System.out.print(e.getKey()+" ");
        }
        
    }

    public static void LinkedHashMap(){ //odered
        Map<Integer,String> mp=new LinkedHashMap<>();
        mp.put(3,"Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        System.out.println(mp);
        System.out.println(mp.get(2)); //Riya
        System.out.println(mp.containsKey(4)); //false
        mp.put(1,"Priya");
        System.out.println(mp); 
        mp.putIfAbsent(2, "Sachin");
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        
        //Iterate over keys
        for(Integer i:mp.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over values
        for(String i:mp.values()){ //we can var inplace of datatypes 
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over the key, value mapping
        for(var e:mp.entrySet()){
            System.out.print(e.getValue()+" ");
        }
        System.out.println();
        for(var e:mp.entrySet()){
            System.out.print(e.getKey()+" ");
        }
        
    }

    public static void TreeMap(){ //sorted order
        Map<Integer,String> mp=new TreeMap<>();
        mp.put(3,"Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        System.out.println(mp);
        System.out.println(mp.get(2)); //Riya
        System.out.println(mp.containsKey(4)); //false
        mp.put(1,"Priya");
        System.out.println(mp); 
        mp.putIfAbsent(2, "Sachin");
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        
        //Iterate over keys
        for(Integer i:mp.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over values
        for(String i:mp.values()){ //we can var inplace of datatypes 
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over the key, value mapping
        for(var e:mp.entrySet()){
            System.out.print(e.getValue()+" ");
        }
        System.out.println();
        for(var e:mp.entrySet()){
            System.out.print(e.getKey()+" ");
        }
        
    }
    public static void main(String[] args) {
        HashMap();
        System.out.println("\n\nLinked hash map: ");
        LinkedHashMap();
        System.out.println("\n\nTreemap: ");
        TreeMap();
        
    }
}
