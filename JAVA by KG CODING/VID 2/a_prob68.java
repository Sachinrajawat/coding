import java.util.Scanner;

public class a_prob68 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(fibonacci(i)+" ");
        }

    }
    public static int fibonacci(int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);
    }
}
