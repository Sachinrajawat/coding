import java.util.*;
public class a6_prob {
    public static int multiply(int p,int q){
        if(q==0) return 1;
        return p*multiply(p, q-1);
    } 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter p: ");
        int p=in.nextInt();
        System.out.print("Enter q: ");
        int q=in.nextInt();
        int ans=multiply(p,q);
        System.out.println("p^q is: "+ans);
    }
}
