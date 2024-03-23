// concatenate all the string 
import java.util.Scanner;

public class ab_prob75{
    public static void main(String[] args) {
        String[] arr=new String[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=in.nextLine();
        }
        StringBuilder sb=new StringBuilder();
        for (String string : arr) {
            sb.append(string).append(" ");
        }
        System.out.println(sb);
    }
}
