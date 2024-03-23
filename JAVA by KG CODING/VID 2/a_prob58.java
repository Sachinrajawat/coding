import java.util.Scanner;

public class a_prob58 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter\n1 for addition\n2 for subtraction\n3 for Multiplication\n4 for Divide");
        int num=in.nextInt();
        System.out.print("Enter two number: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=switch(num){
case 1->a+b;
case 2->a-b;
case 3->a*b;
case 4->a/b;
default->-1;
        };
    System.out.println(ans);
    }
}
