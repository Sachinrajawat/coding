import java.util.*;
public class a7_quickSort {
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partion(int[] arr,int start,int end){
        int pivot=arr[start];
        int count=0;
        for (int i = start+1; i <= end; i++) {
            if(pivot>=arr[i]) count++;
        }
        int pivotIndex=start+count;
        swap(arr, start, pivotIndex);
        int i=start,j=end;
        while(i<pivotIndex&&j>pivotIndex){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pivotIndex&&j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start>=end) return;
        int pi=partion(arr,start,end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = in.nextInt();
        System.out.println("enter array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
