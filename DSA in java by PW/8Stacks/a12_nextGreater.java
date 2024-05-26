import java.util.Stack;

public class a12_nextGreater {
    public static void nextGreaterElement(int[] arr){
        // Stack<Integer> s=new Stack<>();
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    
                    res[i]=arr[j];
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        nextGreaterElement(arr);
    }
}
