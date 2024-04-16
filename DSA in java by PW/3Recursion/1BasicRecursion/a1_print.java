// package DSA in java by PW.3Recursion.1BasicRecursion;
//print all natural number using recursion

import java.util.Scanner;

public class a1_print {
    public static void print(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        print(n);
    }
}
