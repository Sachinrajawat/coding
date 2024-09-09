// package CONTEST.CODECHEF;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int a=in.nextInt();
            int b=in.nextInt();
            boolean isValid=true;
            if(a%2!=0){
                isValid=false;
            }
            else if(a==0 && b%2!=0){
                isValid=false;
            }
            if(isValid) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
