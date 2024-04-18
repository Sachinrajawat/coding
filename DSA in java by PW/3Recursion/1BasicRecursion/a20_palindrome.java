import java.util.*;
public class a20_palindrome {
    static boolean isPalindrome(String s,int start,int end){
        if(start>end) return true;
        if(s.charAt(start)==s.charAt(end)){
            return isPalindrome(s, start+1, end-1);
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=in.nextLine();
        boolean ans = isPalindrome(s,0,s.length()-1);
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }
}
