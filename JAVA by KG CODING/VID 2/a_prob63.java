

public class a_prob63 {
    public static void main(String[] args) {
        int[] arr=new int[]{1000,122,500,4,5};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Max value is "+max);


    }
}
