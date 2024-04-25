import java.util.*;
public class a9_GCD {
    public static int GCD(int p,int q){
        if(q==0) return p;
        return GCD(q,p%q);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter p: ");
        int p=in.nextInt();
        System.out.print("Enter q: ");
        int q=in.nextInt();
        int ans=GCD(p,q);
        System.out.println("GCD of p & q is: "+ans);
    }
}
