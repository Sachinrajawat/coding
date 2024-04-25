import java.util.*;
public class a10_LCM {
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
    
        int LCM=(p*q)/GCD(p,q);
        System.out.println("LCM of p & q is: "+LCM);
    }
}
