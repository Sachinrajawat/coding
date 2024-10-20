
//given n,print all possible number from 1-n in hexicographical order

import java.util.Scanner;

public class lexicographicalNumber {
    public static void lorder(int curr,int n){
        System.out.print(curr+" ");
        if(curr>n) return;
        for(int j=0;j<=9;j++){
            if(10*curr+j>n) return ;
            lorder(10*curr+j, n);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=9;i++){
            lorder(i,n);
        }
    }
}
