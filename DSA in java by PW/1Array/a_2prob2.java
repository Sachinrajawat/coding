import java.util.*;

public class a_2prob2 {
    public static int tripletSum(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==target) count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=in.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target=in.nextInt();
        int ans=tripletSum(array,target);
        System.out.println("Total number of triplet is: "+ans);
    }
}
