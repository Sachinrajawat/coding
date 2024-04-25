import java.util.Scanner;

public class a19_ReverseString {
    public static void reverseString(String s,int index){
        if(index==s.length()) return;
        reverseString(s,index+1);
        System.out.print(s.charAt(index));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=in.nextLine();
        reverseString(s,0);
    }
}
