// package DSA

import java.util.Scanner;



public class a3_prob {
    public static void squareRoot(int x){
        double sqrt=Math.sqrt(x);

        System.out.printf("%.0f",sqrt);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int x=in.nextInt();
        squareRoot(x);
    }
}
