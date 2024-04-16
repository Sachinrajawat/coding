// package DSA in java by PW.3Recursion.1BasicRecursion;
//print n to 1
import java.util.*;
public class a2_prob {
    public static void print(int n){
        //base case
        if(n==1){
        System.out.print(1+" ");
        return;
        }
        //self work
        System.out.print(n+" ");
        //recursive
        print(n-1);
        
    }
    public static void main(String[] args) {
    System.out.print("Enter n: ");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    print(n);
    }
}
