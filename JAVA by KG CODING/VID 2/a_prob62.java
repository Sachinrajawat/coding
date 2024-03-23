import java.util.Scanner;

public class a_prob62 {
    public static void main(String[] args) {
        System.out.print("Enter a numeber: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean x=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println(num+" is not a prime num");
                x=false;
                break;
            }
        }
        if(x) System.out.println(num+" is prime num");
    }
}
