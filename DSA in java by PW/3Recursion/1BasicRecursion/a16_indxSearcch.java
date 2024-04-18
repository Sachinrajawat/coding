import java.util.*;

public class a16_indxSearcch {
    public static void Search(int[] arr,int num,int idx){
        if(idx==arr.length) return;
        if(arr[idx]==num){
            System.out.print(idx+" ");
            Search(arr, num, idx+1);
        }
        else Search(arr, num, idx+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter num for search: ");
        int num = in.nextInt();
        Search(arr, num,0);
        // for (int i : ind) {
        //     System.out.print(i+" ");
        // }
    }
}
