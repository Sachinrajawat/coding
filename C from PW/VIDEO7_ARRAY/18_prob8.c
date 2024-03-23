#include<stdio.h>
// Rotate the given array 'arr' by k steps, where k is non-negative
// k can be greater than n as well where n is the size of array 'arr'.  

int main(){
    int k;
    printf("Enter the value of k : ");
    scanf("%d",&k);
    int arr[7] = {1,2,3,4,5,6,7};
    for(int i=7-k;i<=6;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<=6-k;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}