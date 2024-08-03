//search element in rotated sorted array with duplicate element. Return true if the element is found else return false.

public class a6_prob {
    public static boolean findTarget(int[] arr,int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return true;
            else if(arr[start] == arr[mid] && arr[end] ==arr[mid]){
                start++;
                end--;
            }
            else if(arr[mid]<=arr[end]){ //mid to end is sorted
                if(target>arr[mid] &&target<=arr[end]){
                    start=mid+1;
                }
                else{
                end=mid-1;
                }
            }
            else{ //start to end sorted
                if(target>=arr[start] &&target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,1,1,1,2,0,0,0};
        int target=2;
        boolean ans=findTarget(arr,target);
        System.out.println(ans);
    }
}
