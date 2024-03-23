#include<stdio.h>
/* Find the difference between the sum of elements at even indices to the sum of elements at odd indices*/
int main(){
    int arr[10]={1,2,3,4,5,6,7,8,9,10};
    int sumEven = 0;
    int sumOdd=0;
    for(int i=0;i<=9;i++){
        if(i%2==0){
            sumEven += arr[i];
            
            }
        else{
            sumOdd += arr[i];
        }
    } 
    printf("%d",sumEven-sumOdd);
    return 0;
}