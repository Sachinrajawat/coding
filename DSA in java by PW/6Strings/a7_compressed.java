import java.util.Scanner;

public class a7_compressed {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter String: ");
        StringBuilder sb=new StringBuilder(in.nextLine());
        String ans="";
        int count=0;
        char ch=sb.charAt(0);
        for(int i=0;i<sb.length();i++){
            if(ch==sb.charAt(i)){
                count++;
            }else{
                ans+=ch;
                ans+=count;
                ch=sb.charAt(i);
                count=1;
                // System.out.println(ch);
            }
        }
        ans+=ch;
        ans+=count;
System.out.println(ans);
    }
}
