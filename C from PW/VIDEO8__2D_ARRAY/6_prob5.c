// given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of rectangle from (l1,r1) to (l2,r2).
#include<stdio.h>

int main(){
    int r;
    printf("Enter the number of rows : ");
    scanf("%d",&r);
    int c;
    printf("Enter the number of column : ");
    scanf("%d",&c);
    printf("Enter the elemnts\n");
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
    int l1;
    printf("Enter l1 : ");
    scanf("%d",&l1);
    int r1;
    printf("Enter r1 : ");
    scanf("%d",&r1);
    int l2;
    printf("Enter l2 : ");
    scanf("%d",&l2);
    int r2;
    printf("Enter r2 : ");
    scanf("%d",&r2);
    int sum=0;
    for(int i=l1;i<=l2;i++){
        for(int j=r1;j<=r2;j++){
            sum+=arr[i][j];
        }
    }
    printf("%d",sum);
    return 0;
}