import java.util.Scanner;

public class a_prob66 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[]{1,-5,85,-6,8};
        int sum=0;
        for(int num:arr){
            if(num<0){
                continue;
            }
            sum+=num;
        }
        System.out.println("The sum of positive number is: "+sum);
;    }
}
