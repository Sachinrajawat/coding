// package DSA in java by PW.3Recursion.2Sorting;
import java.util.*;
public class a5_prob2 {
    
    public static void selectionSort(String[] arr){
        int n=arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }
            String temp=arr[i];
            // int idx=min(arr, i);
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter size: ");
        int size=in.nextInt();
        System.out.println("enter String array: ");
        String[] arr=new String[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.next();
        } 
        selectionSort(arr);
        for (String i : arr) {
            System.out.print(i+" ");
        }
    }
}
