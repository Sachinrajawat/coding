import java.util.Scanner;

public class a_16multi {
    static void PrintArray(int[][] arr,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multi(int[][] mat1,int r1,int c1,int[][] mat2,int r2,int c2){
        if(c1!=r2){
            System.out.println("This multiplication is not possible");
            return;
        }
        int[][] mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    mul[i][j]+=mat1[i][k]*mat2[k][j];
                }
                
            }
        }
        System.out.println("MULTIPLICATION MATRIX IS: ");
        PrintArray(mul,r1,c2);
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
        System.out.print("Enter r2 :");
        int r2=in.nextInt();
        System.out.print("Enter c2: ");
        int c2=in.nextInt();
        int[][] mat2=new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        PrintArray(mat1,r1,c1);
        System.out.println("Matrix 2: ");
        PrintArray(mat2,r2,c2);
        multi(mat1,r1,c1,mat2,r2,c2);
    }
}
