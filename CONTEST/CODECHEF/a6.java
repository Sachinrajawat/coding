import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            int[][] arr=new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0]=in.nextInt();
                arr[i][1]=in.nextInt();
            }
            int count=0;
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for (int k=j+1;k<n;k++) {
                        double d1=(Math.pow(arr[i][0]-arr[j][0],2)+Math.pow(arr[i][1]-arr[j][1],2));
                        double d2=(Math.pow(arr[i][0]-arr[k][0],2)+Math.pow(arr[i][1]-arr[k][1],2));
                        double d3=(Math.pow(arr[k][0]-arr[j][0],2)+Math.pow(arr[k][1]-arr[j][1],2));
                        if(d1>d2 && d1>d3){
                            if(d1==d2+d3) count++;
                        }
                        else if(d2>d3 && d2>d1){
                            if(d2==d1+d3) count++;
                        }
                        else if(d3>d2 && d3>d1){
                            if(d3==d1+d2) count++;
                        }
                    }
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
