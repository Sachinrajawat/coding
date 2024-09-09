import java.math.BigDecimal;
import java.util.Scanner;

public class a2_FormatLitaleTheorem {
    public static boolean isPrime(long p){
        //corner cases
        if(p<=1) return false;
        if(p<=3) return true;
        //This is checked so that we can skip
        //middle five number in below loop
        if(p%2==0 || p%3==0) return false;
        for(int i=5;i<=Math.sqrt(p);i+=6) if(p%i==0 || p%(i+2)==0) return false;
        return true;
    }
    public static boolean FLT(long p,long a){
        if(!isPrime(p)) return false;
        if(a<0) return false;
        if(p%a==0) return false;
        double left=Math.pow(p, a-1);
        left%=a;
        double right=1%a;;
        if(left!=right) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter p: ");
        long p=in.nextLong();
        System.out.print("Enter a: ");
        long a=in.nextLong();
        System.out.println(FLT(p, a));

    }
}
