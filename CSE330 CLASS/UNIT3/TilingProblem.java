/*Given 2*n board and tiles of size 2*1, count the number of ways to tile the given board using the 2*1 */

import java.util.Scanner;

public class TilingProblem {
    /* 
    public static int noOfWays(int n){
        if(n<=2) return n;
        return  noOfWays(n-1)+noOfWays(n-2);
    }*/
    public static int noOfWays(int n){
        
        if(n<=2) return n;
        int[] dp = new int[n];
        dp[1] = 1;
        dp[2]=2;
        for (int i=3; i <= dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter n: ");
        int n=in.nextInt();
        int result=noOfWays(n);
        System.out.println("No. of ways: "+result);
    }
}
