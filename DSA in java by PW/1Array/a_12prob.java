//givena an array return sum/running sum in the same array without creating a new array
public class a_12prob {
    static void prefixSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={-1,-2,3,4,2,5,9};
        prefixSum(arr);
    }
}
