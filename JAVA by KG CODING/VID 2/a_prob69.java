import java.util.Scanner;

public class a_prob69 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println("Your string is "+(isPalindrome(str)?"palindrome":"Not palindrome"));
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr=str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
