// package CSE330 CLASS.UNIT2;
// input: n=3, arr={3,1,2}
// output: {0,1,2,3,3,4,5,6} subset sum in increasing order

import java.util.ArrayList;
import java.util.*;
public class subsetSum {
    public static void subset(int[] arr,ArrayList<Integer> list,int index){
        if(arr.length==index) return;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            temp.add(arr[index]+list.get(i));
        }
        list.addAll(temp);
        subset(arr, list, index+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        //1,2,3,4
        //0,1,2,3,4,5,6,7,5,6,7,6,7,8,9,10
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        subset(arr,list,0);
        Collections.sort(list);
        System.out.println(list);
        // Arrays.sort(arr);
    }
}
