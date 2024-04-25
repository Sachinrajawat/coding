// package DSA in java by PW.3Recursion.2Sorting;
import java.util.*;
public class a2_selectionSort {
    public static int min(int[] arr,int idx){
        int min=arr[idx];
        int index=idx;
        for (int i = idx+1; i < arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
    
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int temp=arr[i];
            int idx=min(arr, i);
            arr[i]=arr[idx];
            arr[idx]=temp;
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
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
