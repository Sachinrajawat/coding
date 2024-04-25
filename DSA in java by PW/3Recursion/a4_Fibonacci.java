import java.util.*;
public class a4_Fibonacci {
    public static int fibonacci(int n){
        if(n==0||n==1) return n;
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter n: ");
    int n=in.nextInt();
    System.out.println(n+"th fibonacci number is: "+fibonacci(n));
    }
}
