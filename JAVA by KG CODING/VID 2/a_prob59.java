
//create a program using do-while to find password checker until a valid password is entered

import java.util.Scanner;

public class a_prob59 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String password;
        do{
        System.out.println("Enter your password: ");
        password=in.nextLine();
        
    }while(!isValidPassword(password));
    System.out.println("Valid password");
    }
    public static boolean isValidPassword(String password){

return password.length()>4;
    }
}
