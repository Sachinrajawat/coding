import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            in.nextLine();
            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextLine();
            }
            for(int i=n-1;i>=0;i--){
                if(arr[i].charAt(0)=='#') System.out.print(1+" ");
                if(arr[i].charAt(1)=='#') System.out.print(2+" ");
                if(arr[i].charAt(2)=='#') System.out.print(3+" ");
                if(arr[i].charAt(3)=='#') System.out.print(4+" ");
                
            }
            System.out.println();
            t--;
        }
    }
}
