//Given the rotated sorted array of the integers, which contains distinct elements, ans an integer terger, return the index of the 
//target, return the index of target if it is in the araay, otherwise return -1.

public class a5_prob {
    public static int findTarget(int[] arr,int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<arr[end]){ //mid to end is sorted
                if(target>arr[mid] &&target<=arr[end]){
                    start=mid+1;
                }
                else{
                end=mid-1;
                }
            }
            else{
                if(target>=arr[start] &&target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
    return -1;
}
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int target=5;
        int ans=findTarget(arr, target);
        System.out.println("Index of target is "+ans);
    }
}
