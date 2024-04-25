// package DSA

import java.util.Scanner;



public class a3_prob {
    public static int squareRoot(int x){
        int st=0,end=x;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==x){
                return mid;
            }else if(val<x){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int x=in.nextInt();
        System.out.println(squareRoot(x));
    }
}
