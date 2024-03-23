#include<stdio.h>

int main(){

    int arr[5];
    for(int i = 0;i<=4;i++){
        int a = i+1;
        printf("Enter element number %d\n",i); 
        scanf("%d ",&arr[i]);
    }
    printf("%d",arr[1]);
    /*int arr[5] = {2,4,6,8,1};
    for(int i=0;i<=4;i++){ // i= 0,1,2,3,4
        printf("%d ",arr[i]);
    }*/
    
    
    /*int arr[5] = {2,4,6,8,1};
    arr[4] = 100; // {2,4,6,8,100} // updating
    printf("%d",arr[4]);*/

    /*float a[3] = {1.2,3.4,5.7};
    printf("%f",a[2]);*/

    /*char arr[4] = {'3','n','Y','%'};
    printf("%c",arr[3]);*/

    return 0;
}