import java.util.Scanner;
//n=5
//3 1 4  1 2
//find the minimum index where sum of left subarray is strictly greater then the right subarray
public class a9PartitionArray {
    public static int canPartition(int[] arr){
        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }
        for (int i : prefixSum) {
            System.out.print(i+" ");
        }
        int ans=-1;
        for(int i=arr.length-1;i>0;i--){
            if(prefixSum[i]-prefixSum[i-1]<prefixSum[i-1]){
                ans=i-1;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int result=canPartition(arr);
        System.out.println();
        System.out.println("Result: "+result);
    }
}
