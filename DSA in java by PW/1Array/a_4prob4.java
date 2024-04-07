//find the second largest element int the given array
import java.util.*;
public class a_4prob4 {
    static int sec_larg(int[] arr){
        int first_max=Integer.MIN_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            if(first_max<arr[i]){
                first_max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (first_max==arr[i]) {
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int sec_max=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(sec_max<arr[i]){
                sec_max=arr[i];
            }
        }
        return sec_max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=in.nextInt();
        }
        
        int ans=sec_larg(array);
        System.out.println("2nd Largest element is: "+ans);
    }
}
