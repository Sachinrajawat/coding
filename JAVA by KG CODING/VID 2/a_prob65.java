import java.util.Scanner;

public class a_prob65 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        while(true){
            System.out.print("Enter your String: ");
            String x=in.next();
            if(x.equals("exit")){
                break;
            }
        }
        System.out.println("You are successfully exited");
        }
}
