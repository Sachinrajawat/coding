import java.util.*;
public class a14_searching {
    public static boolean Search(int[] arr,int idx,int num){
        if(idx==arr.length) return false;
        if(arr[idx]==num) return true;
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
        boolean search=Search(arr,0,num);
        if(search) System.out.println("YES");
        else System.out.println("No");
    }
}
