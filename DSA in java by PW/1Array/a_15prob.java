public class a_15prob {
    static void addTwoMat(int[][] arr1,int[][] arr2){
        int[][] add=new int[arr1.length][arr1.length];
        for (int k = 0; k < arr1.length; k++) {
            for (int k2 = 0; k2 < arr1.length; k2++) {
                add[k][k2]=arr1[k][k2]+arr2[k][k2];
            }
        }
        for (int i=0;i<add.length;i++) {
            for (int j = 0; j < add.length; j++) {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{1,2},{3,4}};
        addTwoMat(arr1, arr2);
    }
}
