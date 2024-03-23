#include<stdio.h>
// write a program to store roll number and marks obtained by 4 students side by side in a matrix

int main(){
    int arr[4][2] = {{1,20},{2,30},{3,40},{4,50}};
    for(int i=0;i<4;i++){
        for(int j=0;j<2;j++){
            printf("%d ",arr[i][j]);
        }
         printf("\n");
    }
   
    return 0;
}