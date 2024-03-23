#include<stdio.h>
// write a program to add two matrices
int main(){
    int r;
    printf("Enter the number of rows : ");
    scanf("%d",&r);
    int c;
    printf("Enter the number of column : ");
    scanf("%d",&c);
    
    printf("Enter first matrix num\n");
    int result[r][c];
    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    // for(int i=0;i<r;i++){
    //     for(int j=0;j<c;j++){
    //         printf("%d ",arr[i][j]);
    //     }
    //     printf("\n");
    // }

    printf("Enter 2nd matrix\n");
    int brr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&brr[i][j]);
            
            
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            result[i][j]=arr[i][j]+brr[i][j];
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d\t",result[i][j]);
        }
        printf("\n");
    }
    // for(int i=0;i<r;i++){
    //     for(int j=0;j<c;j++){
    //         printf("%d ",brr[i][j]);
    //     }
    //     printf("\n");
    // }
    // int result[r][c];
    // for(int i=0;i<r;i++){
    //     for(int j=0;j<c;j++){
            // result[r][c] = arr[r][c]+brr[r][c];
            // printf("%d ",result[r][c]);
        // }
    // }
    printf("\n");
    return 0;
}