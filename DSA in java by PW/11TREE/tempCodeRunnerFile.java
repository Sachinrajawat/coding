import java.util.HashMap;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(var key:map.keySet()){
            max=Math.max(max, map.get(key));
        }
        System.out.println(n-max);
    }
}
