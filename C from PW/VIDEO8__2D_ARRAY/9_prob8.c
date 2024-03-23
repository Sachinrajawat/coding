#include<stdio.h>
// write a program to print the transpose of matrix entered by the user
int main(){
    int arr[2][3]={{1,2,3},{4,5,6}};
    int brr[3][2];
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            printf("%d ",arr[i][j]);
        }
    }
    
    return 0;
}