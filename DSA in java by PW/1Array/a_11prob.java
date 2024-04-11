//given an array sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order
import java.util.*;
public class a_11prob {
    static void sortedSquares(int[] arr){
        int left=0,right=arr.length-1;
        int[] ans=new int[arr.length];
        int i=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[i++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[i++]=arr[right]*arr[right];
                right--;
            }
        }
        for (int j = ans.length-1; j >=0; j--){
            System.out.print(ans[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={-10,-7,-5,-1,1,2,3,4,12};
        sortedSquares(arr);
    }
}
