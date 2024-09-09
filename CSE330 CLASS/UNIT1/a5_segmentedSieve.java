import java.util.ArrayList;
import java.util.Scanner;

public class a5_segmentedSieve {
    static boolean isPrime(int n){
        //corner cases
        if(n<=1) return false;
        if(n<=3) return true;
        //This is checked so that we can skip
        //middle five number in below loop
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i<=Math.sqrt(n);i+=6) if(n%i==0 || n%(i+2)==0) return false;
        return true;
    }
    public static void findPrime(int r,ArrayList<Integer> prime){
        for(int i=2;i*i<r;i++){
            if(isPrime(i)) prime.add(i);
        }
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter lower value: ");
        int l=in.nextInt();
        System.out.print("Enter upper value: ");
        int r=in.nextInt();
        ArrayList<Integer> prime=new ArrayList<>();
        findPrime(r,prime);
        System.out.println(prime);
        int[] arr=new int[r-l+1];
        for(int i=0;i<prime.size();i++){
            for(int j=l;j<=r;j++){
                if(j%prime.get(i)==0) arr[j%l]=1;
            }
        }
        System.out.print("Prime num between "+l+" and "+r +" are: ");
        for(int i=0;i<r-l;i++){
            if(arr[i]==0) System.out.print(l+i+" ");
        }
    }
}
