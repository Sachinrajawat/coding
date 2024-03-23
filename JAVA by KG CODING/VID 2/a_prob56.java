import java.util.Scanner;

public class a_prob56 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter number: ");
    int num=in.nextInt();
    String a=num>80?"High":num>=50?"Moderate":"Low";
    System.out.println(a);
}
}
