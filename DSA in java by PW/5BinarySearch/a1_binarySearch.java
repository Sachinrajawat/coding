// package DSA in java by PW.5BinarySearch;

public class a1_binarySearch {
    public static boolean binarySearch(int[] arr,int start,int end,int target){
        if(start>end) return false;
        int mid=(start+end)/2;
        if(arr[mid]==target) return true;
        else if(arr[mid]>target)
            return binarySearch(arr, start, mid-1, target);
        else
            return binarySearch(arr,mid+1,end, target);
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,7,15,20,24,45,50,77};
        boolean ans=binarySearch(arr,0,arr.length-1,4);
        if(ans) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
