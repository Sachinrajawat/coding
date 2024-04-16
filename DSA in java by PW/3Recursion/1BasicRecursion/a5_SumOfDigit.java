import java.util.*;
public class a5_SumOfDigit {
    public static int sum(int n){
        if(n>=0&&n<=9) return n;
        return sum(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        System.out.println("Sum of digit of "+n+" is: "+sum(n));
        }
}
