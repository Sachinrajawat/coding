public class a11_printArray {
    public static void printArray(int[] arr,int index){
        if(index==arr.length) return;
        System.out.print(arr[index]+" ");
        printArray(arr,index+1);
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4};
        printArray(arr,0);
    }
}
