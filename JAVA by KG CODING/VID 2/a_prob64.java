import java.util.Scanner;

public class a_prob64 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,2,4,6,7,6,7};
        System.out.print("Enter num for occurences check: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int count=0;
        for(int i:arr){
            if(i==num) count++;
        }
        System.out.println("num of occurence of "+num+" in array is "+count);
    }

}
