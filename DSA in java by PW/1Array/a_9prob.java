//sort an array consisting of only 0s and 1s
public class a_9prob {
    static void sort(int[] arr){
        int size=arr.length;
        int count=0;
        for (int i : arr) {
            if(i==0){
                count++;
            }
        }
        for (int i = 0; i < size; i++) {
            if(i<count)
            arr[i]=0;
            else
            arr[i]=1;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
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
        if(arr[left]==1&&arr[right]==0){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
    }
    for (int i : arr) {
        System.out.print(i+" ");
    }
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,0,0,1};
        sort(arr);
        
        System.out.println("\nsort by another approach");
        sorting(arr);
    }
    
}
