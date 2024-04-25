import java.util.*;
public class a7_prob {
    public static void multiple(int num,int k){
        if(k==1){
            System.out.print(num+" ");
            return;
        }
        multiple(num, k-1);
        System.out.print(num*k+" ");
    }
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=in.nextInt();
        System.out.print("Enter k: ");
        int k=in.nextInt();
        multiple(num,k);
    }
}
