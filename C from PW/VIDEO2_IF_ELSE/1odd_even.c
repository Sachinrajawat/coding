#include<stdio.h>

int main(){
    int n; // dabba ban gaya
    printf("Enter a number : ");
    scanf("%d",&n); // dabbe me value daal di, n = 7
    if(n%2==0){
        printf("Even number");
    }
    
    /*if(n%2!=0){
        printf("Odd number");
    }*/

    else{
        printf("Odd number");
    }
    return 0;
}