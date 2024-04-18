import java.util.*;
public class a17_indsearch {
    public static ArrayList<Integer> Search(int[] arr,int num,int idx){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx==arr.length) return new ArrayList<Integer>();  //return empty array list

        if(arr[idx]==num){
            ans.add(idx);
            ArrayList<Integer> smallAns=Search(arr, num, idx+1);
            ans.addAll(smallAns); //for adding all

        }
        else {
        ArrayList<Integer> smallAns=Search(arr, num, idx+1);
        ans.addAll(smallAns);
        }
        return ans;
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
        ArrayList<Integer> ans=Search(arr, num,0);
        for (Integer integer : ans) {
            System.out.print(integer+" ");
        }
    }
}
