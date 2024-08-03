public class a8_countSort {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    public static void basicCountSort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        // find to largest element of the arr
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //prefix sum 
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        // int k=0;
        for (int i = n-1; i >=0; i--) {
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }

        //copy all elements of output to arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    static void display(int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1 ,4 ,5 ,2 ,2 ,5};
        basicCountSort(arr);
        display(arr);
    }
}
