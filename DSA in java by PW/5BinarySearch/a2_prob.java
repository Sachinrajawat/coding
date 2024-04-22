

public class a2_prob {
    public static int binarySearch(int[] arr,int start,int end,int target){
        if(start>end) return -1;
        int mid=(start+end)/2;
        if(target==arr[mid]){
            int index=mid;
            for(int i=mid-1;i>=0;i--){
                if(arr[i]==target){
                    index=i;
                }
                else break;
            }
            return index;
        }else if(target<arr[mid])
        return binarySearch(arr, start, mid-1, target);
        else
        return binarySearch(arr, mid+1, end, target);
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,6,6,6,8,9,9,9};
        int ans=binarySearch(arr,0,arr.length-1,9);
        System.out.println("first occurrence of 9 is "+ans);
    }
}
