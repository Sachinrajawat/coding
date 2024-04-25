// package DSA in java by PW.3Recursion.2Sorting;

import java.util.Scanner;

public class a1_bubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag=false; // has any swapping happend
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;  //some swap has happend
                }
            }
            if(flag==false){ //have any swaps happend?
                return;
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
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
