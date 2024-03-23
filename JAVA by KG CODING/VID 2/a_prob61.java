import java.util.Scanner;

public class a_prob61 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number for table: ");
        int num=in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}