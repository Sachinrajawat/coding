//create a number guessing game where the program selects a random number, and the user has to guess it
import java.util.*;
public class ab_prob74 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guess=in.nextInt();
        int random=(int)Math.ceil(100*Math.random());
        System.out.println("Random Number guess by program is: "+random);
        if(random==guess) System.out.println("Your Guess is correct");
        else System.out.println("Your Guess is wrong");

    }
}
