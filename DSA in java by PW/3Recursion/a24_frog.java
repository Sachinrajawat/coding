import java.util.*;
public class a24_frog {
    public static void frogSum(int[] arr,int index,int cost){
        if(index==arr.length-1){

            System.out.println("Cost: "+cost);
            return;
        }
        if(Math.abs(arr[index]-arr[index+1])<Math.abs(arr[index]-arr[index+2])){
            int x=Math.abs(arr[index]-arr[index+1]);
            frogSum(arr, index+1,cost+x);
        }
        else{
            int x=Math.abs(arr[index]-arr[index+2]);
            frogSum(arr, index+2,cost+x);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size=in.nextInt();
        System.out.println("enter array: ");
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        frogSum(arr, 0, 0);
    }
}
