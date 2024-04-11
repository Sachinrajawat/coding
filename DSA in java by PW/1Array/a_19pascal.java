//pascal triangle

import java.util.Scanner;

public class a_19pascal {
    static void PrintArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void pascalTriangle(int n){
        int[][] mat=new int[n][];
        for (int i = 0; i < n; i++) {
            //ith row has i+1 column
            mat[i]=new int[i+1];
            mat[i][0]=mat[i][i]=1;
            for (int j = 1; j <i; j++) {
                mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
            }
        }
        System.out.println("Pascal triangle: ");
        PrintArray(mat);
    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pascalTriangle(n);
    }
}
