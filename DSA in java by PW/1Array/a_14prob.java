//check if we can partion the array into two subarrays with equal sum

import java.util.Scanner;

public class a_14prob {
    static int[] prefixSum(int[] arr){
        int[] ans=new int[arr.length];
        ans[0]=arr[0];
        int j=1;
        for(int i=1;i<arr.length;i++){
            ans[j++]=arr[i]+ans[i-1];
        }
        return ans;
    }
    static int[] suffixSum(int[] arr){
        int[] ans=new int[arr.length];
        ans[arr.length-1]=arr[arr.length-1];
        int j=arr.length-2;
        for(int i=arr.length-2;i>=0;i--){
            ans[j--]=ans[i+1]+arr[i];
        }
        return ans;
        
    }
    public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int size=in.nextInt();
    int[] array=new int[size];
    System.out.println("Enter the Array: ");
    for(int i=0;i<size;i++){
        array[i]=in.nextInt();
    }
    int[] prefixArray=prefixSum(array);
    int[] suffixArray=suffixSum(array);
    for (int k=0;k<size;k++) {
        System.out.print(prefixArray[k]+" ");
    }
    System.out.println();
    for (int k : suffixArray) {
        System.out.print(k+" ");
    }
    System.out.println();
    int i=0,j=size-1;
    boolean x=false;
    while (i<j) {
    if(prefixArray[i]>suffixArray[j]){
        j--;
    }
    else if(prefixArray[i]<suffixArray[j]){
        i++;
    }
    else{
        x=true;
        i++;
        j--;
    }
}
if(x){
    System.out.println("TRUE");
}
else System.out.println("FALSE");
}
}

