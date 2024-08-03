// Rotated search
/*A rotated sorted array is a sorted array on which ratation operation has been performed some number of times.
Given a rotated sorted array find the index of the minimum element in the array.
All element int he array are unique.
*/
public class a4_prob {
    public static int rotatedArray(int[] arr){
        int start=0,end=arr.length-1;
        int ans=Integer.MIN_VALUE;
        while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[end]){
            start=mid+1;
        }
        else if(arr[mid]<=arr[end]){
            ans=Math.max(ans,mid);
            end=mid-1;
        }
    }
        return ans;
    } 
    public static void main(String[] args) {
        int[] arr={10,11,12,1,2,3,4,5,6,7,8,9}; //ans 5
        // int[] arr={3,1,2};
        int ans=rotatedArray(arr);
        System.out.println(ans);
    }
}
