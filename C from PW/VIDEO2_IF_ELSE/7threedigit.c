#include<stdio.h>

int main(){
    int x;
    printf("Enter a number : ");
    scanf("%d",&x);
    if(x>99 && x<1000){
        printf("It is a Three digit number");
    }
    else{
        printf("It is not a Three digit number");
    }
    return 0;
}