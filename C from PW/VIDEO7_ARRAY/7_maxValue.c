#include<stdio.h>
// Find max value out of all the elements in the array
int main(){
    int arr[7] = {1,4,6,34,2,4,76};
    int max = arr[0]; // sbse chota number
    for(int i=0;i<=6;i++){
        if(max<arr[i]){
            max = arr[i];
        }    
    }
    printf("%d",max);
    return 0;
}