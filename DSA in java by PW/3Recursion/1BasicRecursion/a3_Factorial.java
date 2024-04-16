import java.util.Scanner;

public class a3_Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int ans=n*factorial(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        int ans=factorial(n);
        System.out.println("Factorial of "+n+" is: "+ans);
    }
}
