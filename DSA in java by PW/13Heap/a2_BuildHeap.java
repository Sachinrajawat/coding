public class a2_BuildHeap {
    static void Heapify(int[] arr,int index,int n){
        int largest=index;
        int left=2*index+1;
        int right=2*index+2;
        //max heap
        if(left<n && arr[left]>arr[largest]) largest=left;
        if(right<n && arr[right]>arr[largest]) largest=right;
        //min heap
        // if(left<n && arr[left]<arr[largest]) largest=left;
        // if(right<n && arr[right]<arr[largest]) largest=right;
        
        if(largest!=index){
            int temp=arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            Heapify(arr, largest, n);
        }
    }
    static void BuildMaxHeap(int[] arr,int n){
        //Step down
        for(int i=n/2;i>=0;i--){
            Heapify(arr,i,n);
        }
    }
    static void printHeap(int[] arr,int n){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={10,3,8,9,5,13,18,14,11,70};
        BuildMaxHeap(arr,10);
        printHeap(arr,10);
    }
}
