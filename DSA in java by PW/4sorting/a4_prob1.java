// package DSA in java by PW.3Recursion.2Sorting;
import java.util.*;
public class a4_prob1 {
    public static void Sort(int[] arr){
        int count=0;
        int size=arr.length;
        for (int i = 0; i < size-count; i++) {
            if(arr[i]==0){
                for (int j = i; j < size-count-1; j++) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter size: ");
        int size=in.nextInt();
        System.out.println("enter array: ");
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        } 
        Sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
