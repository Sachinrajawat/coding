import java.util.*;
public class a_17transpose {
    static void PrintArray(int[][] arr,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    /*static void transpose(int[][] arr,int r,int c){
        int[][] trans=new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose matrix is: ");
        PrintArray(trans,c,r);
    }*/
    
    //only for square matrix
    static void transposeInPlace(int[][] mat1,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp=mat1[i][j];
                mat1[i][j]=mat1[j][i];
                mat1[j][i]=temp;
            }
        }
        // System.out.println("Transpose mat: ");
        //     PrintArray(mat1,c,r);
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
        System.out.println("Original matrix: ");
        PrintArray(mat1,r1,c1);
        transposeInPlace(mat1, r1, c1);
        System.out.println("Transpose mat: ");
        PrintArray(mat1,r1,c1);
    }
}
