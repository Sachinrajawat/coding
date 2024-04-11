import java.util.Scanner;

public class a_21spiralMat {
    static void PrintArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiralMat(int n){
        int[][] mat=new int[n][n];
        int tr=0,rc=n-1,lc=0,br=n-1;
        int a=1;
        while(a<=n*n){
            int i=tr,j=lc;
            while (j<=rc &&a<=n*n) {
                mat[i][j]=a++;
                j++;
            }
            rc--;
            j--;
            i++;
            while(i<=br&&a<=n*n){
                mat[i][j]=a++;
                i++;
            }
            br--;
            i--;
            j--;
            while(j>=lc&a<=n*n){
                mat[i][j]=a++;
                j--;
            }
            lc++;
            j++;
            i--;
            while (i>tr&a<=n*n) {
                mat[i][j]=a++;
                i--;
            }
            tr++;
        }
PrintArray(mat);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        spiralMat(n);
    }
}
