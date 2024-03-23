// write a program to print the row number having the maximum sum in a given matrix.
#include<stdio.h>
#include<limits.h>
int main(){
    int r;
    printf("Enter the number of rows : ");
    scanf("%d",&r);
    int c;
    printf("Enter the number of column : ");
    scanf("%d",&c);
    printf("Enter the elemnts\n");
    int sum[r];
    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
        printf("\n");
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    for(int i=0;i<r;i++){
        sum[i]=0;
        for(int j=0;j<c;j++){
            sum[i]=sum[i]+arr[i][j];
        }
        printf("%d ",sum[i]);
    }
    int min=sum[0];
    int max=sum[0];
    for(int i=1;i<r;i++){
        if(sum[0]>sum[i]){
            min=sum[i];
        }
        else if(sum[0]<sum[i]){
            max=sum[i];
        }
    }
    printf("\nThe minimum value is %d\n",min);
    printf("The maximum value is %d",max);
return 0;
}