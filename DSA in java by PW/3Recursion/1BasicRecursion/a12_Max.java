import java.util.Scanner;

public class a12_Max {
    public static int Max(int[] arr,int index){
        if(index==arr.length-1) return arr[index];

        int smallAns=Max(arr, index+1);
        
        return Math.max(arr[index], smallAns);
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter five num: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int max=Max(arr,0);
        System.out.println("Max: "+max);
    }
}
