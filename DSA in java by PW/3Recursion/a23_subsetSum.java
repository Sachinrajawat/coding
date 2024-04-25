import java.util.Scanner;

public class a23_subsetSum {
    public static void subsetSum(int[] arr,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        //curr idx+sum
        subsetSum(arr, n, idx+1, sum+arr[idx]);
        //curr ans
        subsetSum(arr, n, idx+1, sum);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Subset sum: ");
        subsetSum(arr,size,0,0);
    }
}
