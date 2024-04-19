// package DSA in java by PW.3Recursion.2Sorting;
import java.util.*;
public class a3_insertionSort {
    public static void insertionSort(int[] arr){
        int i=1;
        while (i!=arr.length) {
            int k=i;
            for (int j = i-1; j >=0; j--) {
                if(arr[j]>arr[k]){
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    k--;
                }
                else break;
            }
            i++;
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
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
