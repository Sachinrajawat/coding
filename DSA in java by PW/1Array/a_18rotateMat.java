//given a sqr matrix, turn it by 90 degrees in a clockwise direnction without using any extra space
import java.util.*;
public class a_18rotateMat {
    static void PrintArray(int[][] arr,int r){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotateClockWise(int[][] mat,int r ){
        int k=r-1;
        int[][] ans=new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                ans[j][k]=mat[i][j];
            }
            k--;
        }
        System.out.println("Clock wise rotate mat: ");
        PrintArray(ans,r);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter r1 :");
        int r1=in.nextInt();
        int[][] mat1=new int[r1][r1];
        System.out.println("Enter "+r1*r1+" elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < r1; j++) {
                mat1[i][j]=in.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        PrintArray(mat1,r1);
        rotateClockWise(mat1, r1);
        
        
    }
}
