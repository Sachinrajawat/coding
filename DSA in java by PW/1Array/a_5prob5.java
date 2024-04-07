//given an array. Return the first value that is repeating in this array. if no value is being repeated, return -1
import java.util.*;
public class a_5prob5 {
    static int first_repeat(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=in.nextInt();
        }
        
        int ans=first_repeat(array);
        System.out.println("1st repeating value is: "+ans);
    }
}
