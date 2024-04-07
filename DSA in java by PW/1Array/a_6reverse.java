//reverse the array without making the new array
public class a_6reverse {
    public static void main(String[] args) {
        
        int[] arr={1,345,5,6};
        int i=0,j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
    
    
}
