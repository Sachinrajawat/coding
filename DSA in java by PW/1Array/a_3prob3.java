//Find the unique number in a given Array where all the elements are being repeated twice with one value being unique
public class a_3prob3 {
    static int uniqueNum(int[] arr){
    int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
                
                
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,3,4,5,7,5,7};
        int num=uniqueNum(arr);
        System.out.println("unique number is: "+num);
    }
}
