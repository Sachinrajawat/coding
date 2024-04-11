//given an array, move all the even integer at the beginning of the array followed by all the odd integers. The releative order of even and odd doesnt metter
public class a_10prob {
    static int[] swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return arr;
    }
    static void sorting(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
        if(arr[left]%2!=0&&arr[right]%2==0){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2!=0){
            right--;
        }
    }
    for (int i : arr) {
        System.out.print(i+" ");
    }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
    
        
        System.out.println("\nsort by another approach");
        sorting(arr);
    }
}
