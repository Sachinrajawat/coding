// package JAVA KG CODING.OOPS.4Exception&FileHandling;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        try{
        int result = a/b;
        System.out.println("Result is "+result);
        }catch(ArithmeticException exception){
            System.out.printf("%s , Enter valid values",exception.getMessage());
        }
    }
}
