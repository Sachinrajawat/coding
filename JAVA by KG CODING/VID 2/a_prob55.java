import java.util.Scanner;
//create a program to calculate the abslute value of a given integer
public class a_prob55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a=n>=0?n:-n;
        System.out.println(a);
    }
}
