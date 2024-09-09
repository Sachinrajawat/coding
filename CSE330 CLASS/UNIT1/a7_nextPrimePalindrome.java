import java.util.Scanner;

public class a7_nextPrimePalindrome {
    public static boolean isPalindrome(int n){
        if(n<10) return true;
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder(s);
        String revS=sb.reverse().toString();
        if(s.equals(revS)) return true;
        return false;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<n;i+=6) if(n%i==0||n%(i+2)==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num: ");
        int n=in.nextInt();
        n++;
        while(!(isPrime(n) && isPalindrome(n))) n++;
        System.out.println(n);
    }
}
