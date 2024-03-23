// package JAVA KG CODING.OOPS.4Exception&FileHandling;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        System.out.print("Enter first num: ");
        int first = in.nextInt();
        System.out.print("Enter second num: ");
        int second = in.nextInt();
        try{
        int result= first/second;
        System.out.println("Result is: "+result);
        }catch(ArithmeticException ex){
            if(ex.getMessage().equals("/ by zero")){
            System.out.println("divide by zero occured");
        }
        else{
            throw ex;
        }
    }
    }
}
