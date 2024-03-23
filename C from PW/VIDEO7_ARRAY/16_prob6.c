#include<stdio.h>
// Write a program to copy the content of one array into another in the reverse order.
int main(){
    int arr[5]={1,2,3,4,5};
    int brr[5];
    for(int i=0;i<=4;i++){
        brr[i] = arr[5-i];
    }
    for(int i=1;i<=5;i++){
        printf("%d ",brr[i]);
    }

    return 0;
}