// package CONTEST.CODECHEF.C2;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t>0) {
            int n=in.nextInt();
            int k=in.nextInt();
            int op=0;
            if (k == 1) {
                op = n;
            } else {
                while (n > 0) {
                    int highestPower = (int) (Math.log(n) / Math.log(k));

                    n -= Math.pow(k, highestPower);
                    
                    // Increment operation count
                    op++;
                }
            }
            System.out.println(op);
            
            t--;
        }
    }
}
