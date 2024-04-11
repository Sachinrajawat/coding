import java.util.*;
public class a_20spiral {
    static void PrintArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiral(int[][] mat,int r,int c){
        int tr=0,rc=c-1,lc=0,br=r-1;
        
        int totalElement=0;
        while(totalElement<r*c){
            int i=tr,j=lc;
            while (j<=rc &&totalElement<r*c) {
                System.out.print(mat[i][j]+" ");
                totalElement++;
                j++;
            }
            rc--;
            j--;
            i++;
            while(i<=br&&totalElement<r*c){
                System.out.print(mat[i][j]+" ");
                i++;
                totalElement++;
            }
            br--;
            i--;
            j--;
            while(j>=lc&totalElement<r*c){
                System.out.print(mat[i][j]+" ");
                j--;
                totalElement++;
            }
            lc++;
            j++;
            i--;
            while (i>tr&totalElement<r*c) {
                System.out.print(mat[i][j]+" ");
                i--;
                totalElement++;
            }
            tr++;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter r1 :");
        int r1=in.nextInt();
        System.out.print("Enter c1: ");
        int c1=in.nextInt();
        int[][] mat1=new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j]=in.nextInt();
            }
        }
        PrintArray(mat1);
        System.out.println("spiral matrix: ");
        spiral(mat1,r1,c1);
    }
}
