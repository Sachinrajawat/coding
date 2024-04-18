import java.util.*;
public class a15_search {
    public static int Search(int[] arr,int idx,int num){
        if(idx==arr.length) return -1;
        if(arr[idx]==num) return idx;
        return Search(arr, idx+1, num);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("enter "+size+" element: ");
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter num for search: ");
        int num=in.nextInt();
        int ind=Search(arr,0,num);
        System.out.println("num is present at index : "+ind);
    }
}
