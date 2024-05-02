// package HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class a2_prob {
    public static void main(String[] args) {
        // int n=6;
        int[] arr={1,3,2,2,2,2,1,4,4,4,4,1};
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }else{
                int x=mp.get(i);
                mp.put(i,++x);
            }
        }
        System.out.println(mp);
        int max=Integer.MIN_VALUE;
        for(var e:mp.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
            }
        }
        System.out.println(max);
    }
}
