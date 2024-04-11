//rotate the given array 'a' by k steps,where k is non-negative. k can be greater than n as well

import java.util.Scanner;

public class a_7rorate {
    static void rotate(int[] arr,int k){
        
        int step=k%arr.length;
        for(int i=arr.length-step;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length-step; i++) {
            System.out.print(arr[i]+" ");
            
        }
System.out.println();
    }
    // static int[] reverse(int[] arr,int start,int end){
    //     int size=end-start;
    //     int[] ans=new int[size];
    //     int j=0;
    //     for (int i:end-1;i>=start;i--) {
    //         ans[j++]=arr[i];
    //     }
    //     return ans;
    // }
    static void rotateWithoutExtraSpace(int[] arr,int k){
        System.out.println("ARRAY ROTATE WITHOUT EXTRA SPACE");
        int step=k%arr.length;
        int i=arr.length-step,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        int a=0,b=arr.length-step-1;
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        for (int l=arr.length-1;l>=0;l--) {
            System.out.print(arr[l]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
    Scanner in= new Scanner(System.in);
    System.out.print("enter step: ");
    int step=in.nextInt();
    rotate(arr,step);
    rotateWithoutExtraSpace(arr, step);
    }
    
}
