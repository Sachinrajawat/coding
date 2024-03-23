//create a program using do while to implement a numebr guessing game

import java.util.Scanner;

public class a_prob60 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        do{
            System.out.print("Guess the number: ");
            num=in.nextInt();

        }while(!isValidGuess(num));
        System.out.println("Correct guess");
    }
    public static boolean isValidGuess(int num){
        if(num==50){
            return true;
        }
            return false;
    }
}
