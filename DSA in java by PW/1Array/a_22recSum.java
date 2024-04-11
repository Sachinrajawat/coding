import java.util.Scanner;

public class a_22recSum {
    static void PrintArray(int[][] arr,int r,int c){
        for (int i = 0; i <r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
/* 
    // M-1
    static void rectangleSum(int[][] mat,int r,int c,int l1,int r1,int l2,int r2){
        int sum=0;
        if(l1<r&&r1<c){
            if(l1<=l2&&r1<=r2){
                for (int i = l1; i <=l2; i++) {
                    for (int j = r1; j <=r2; j++) {
                        sum+=mat[i][j];
            }
        }
        System.out.println("sum "+sum);
    }
    else{
        System.out.println("l1 should be less than l2 & r1 should be less than r2");
    }
    }
    else{
        System.out.println("l1 & r1 should be less than r & c");
    }
        
    }
    */

    
    static int[][] prefixSum(int[][] mat,int r,int c){
        
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat[i][j]+=mat[i][j-1];
            }
        }
        return mat;
        // PrintArray(mat,r,c);
    }
    /* 
    //M-2
    static void rectangleSum2(int[][] mat,int r,int c,int l1,int r1,int l2,int r2){
        int[][] ans=prefixSum(mat, r, c);
        int sum=0;
        for (int i = l1; i <=l2; i++) {
            sum+=ans[i][r2]-ans[i][r1-1];
        }
        System.out.println("Sum: "+sum);
    }
    */
    static int[][] prefixSumColumn(int[][] mat,int r,int c){
        
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                mat[i][j]+=mat[i-1][j];
            }
        }
        return mat;
        // PrintArray(mat,r,c);
    }
    static void rectangleSum3(int[][] mat,int r,int c,int l1,int r1,int l2,int r2){
        int[][] Row=prefixSum(mat, r, c);
        int[][] column=prefixSumColumn(Row, r, c);
        // System.out.println("Column: ");
        // PrintArray(column,r,c);
        int sum=0;
        sum=column[l2][r2]-column[l1-1][r2]-column[l2][r1-1]+column[l1-1][r1-1];
        System.out.println("Sum: "+sum);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter r :");
        int r=in.nextInt();
        System.out.print("Enter c: ");
        int c=in.nextInt();
        int[][] mat1=new int[r][c];
        System.out.println("Enter "+r*c+" elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j]=in.nextInt();
            }
        }
        System.out.print("enter l1: ");
        int l1=in.nextInt();
        System.out.print("enter r1: ");
        int r1=in.nextInt();
        System.out.print("enter l2: ");
        int l2=in.nextInt();
        System.out.print("enter r2: ");
        int r2=in.nextInt();
        PrintArray(mat1,r,c);
        // rectangleSum(mat1,r,c,l1,r1,l2,r2);
        // rectangleSum2(mat1,r,c,l1,r1,l2,r2);
        rectangleSum3(mat1,r,c,l1,r1,l2,r2);
    }
}
