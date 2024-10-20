// package CONTEST.CODECHEF;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int count=0;
            int l=in.nextInt();
            int r=in.nextInt();
            if(l==r){
                count=1;
            }
            else{
                int k=1;
                while(l<=r){
                    if(l+k<=r)
                    count++;
                    l+=k;
                    k++;
                }
                count++;
            }
            System.out.println(count);
            t--;
        }
    }
}
