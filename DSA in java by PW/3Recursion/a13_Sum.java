import java.util.*;
public class a13_Sum {
public static int Sum(int[] arr,int ind){
    if(ind==arr.length) return 0;
    
    return arr[ind]+Sum(arr, ind+1);
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter five num: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int sum=Sum(arr,0);
        System.out.println("Sum: "+sum);
    }
}
