// absolute value = modulus
#include<stdio.h>
int main(){
    int x;
    printf("Enter a number : ");
    scanf("%d",&x);
    if(x<0){ // if n is negative
        x = x * (-1);
    }
    printf("The absolute value is : %d",x);
    return 0;
}