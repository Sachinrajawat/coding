// package DSA in java by PW.8Stacks;

import java.util.Stack;

public class a10_consecutive {
    public static void consecutive(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        // int i=0;
        for(int i=0;i<n;i++){
            if(st.size()==0|| st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==n-1||arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
            int[] res=new int[st.size()];
            int m=res.length;
            for(int j= m-1;j>=0;j--){
                res[j]=st.pop();
            }
            for(int j=0;j<m;j++){
                System.out.print(res[j]+" ");
            }
        }
    
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        consecutive(arr);
    }
    
}
