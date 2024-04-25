import java.util.*;
public class a8_prob {
    public static int sum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return sum(n-1)-n;
        }else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        System.out.println("Sum of natural number till "+n+" with alternate sign is: "+sum(n));
    }
}
