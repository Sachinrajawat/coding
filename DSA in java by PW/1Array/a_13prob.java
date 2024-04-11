import java.util.Scanner;

public class a_13prob {
    /*static void sum(int[] arr,int l,int r){
        int sum=0;
        for (int i = l-1; i <=r; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of range "+l+" to "+r+" is: "+sum);
    }*/
    //method 2
    static int[] prefixSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
        
    }

    static void sum(int[] arr, int l,int r){
        int[] ans = prefixSum(arr);
        if(l==1 || l==r){
            System.out.println(arr[r-1]);
        }
        else{
        System.out.println(arr[r-1]-arr[l-2]);
    }
        
}
public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print("Enter the num of queries: ");
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        int[] ans=prefixSum(arr);
        while(q>0){
            System.out.println("Enter range of indices in l to r: ");
            int l=in.nextInt();
            int r=in.nextInt();
            sum(ans,l,r);
            q--;
        }
    }
}
