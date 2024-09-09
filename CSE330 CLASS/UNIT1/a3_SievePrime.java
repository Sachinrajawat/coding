// package CSE330 CLASS.UNIT1;

import java.util.ArrayList;
import java.util.Scanner;

public class a3_SievePrime {
    public static void Seive(int n,ArrayList<Integer> arr){
        int i=0;
        int p=arr.get(i);
        while(p*p<=n){
            for(int j=i+1;j<arr.size();j++) if(arr.get(j)%p==0) arr.remove(j);
            i++;
            p=arr.get(i);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=2;i<=n;i++) arr.add(i);

        System.out.println(arr);

        Seive(n,arr);
        System.out.println("Prime no.: "+arr);
    }
}
