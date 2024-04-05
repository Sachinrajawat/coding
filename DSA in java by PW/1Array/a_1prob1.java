//Find the Total number of pairs in the given array whose sum is equal to the given x

import java.util.Scanner;

public class a_1prob1 {
    public static int targetSum(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int[] array=new int[6];
        for(int i=0;i<6;i++){
            array[i]=in.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target=in.nextInt();
        int ans=targetSum(array,target);
        System.out.println("Total number of pairs is: "+ans);
    }
}
